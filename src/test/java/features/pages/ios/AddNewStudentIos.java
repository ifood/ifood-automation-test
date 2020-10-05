package features.pages.ios;

import features.elements_mapping.ios.AddNewStudentMapping;
import features.pages.AppiumActions;
import features.utils.GlobalVariables;
import io.appium.java_client.MobileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddNewStudentIos extends AppiumActions {
    public AddNewStudentMapping addNewStudentMapping;

    public AddNewStudentIos(){
        this.addNewStudentMapping = new AddNewStudentMapping();
    }

    public void fillTheAddNewStudentFieldsWithTheFollowingValues(Map<String, String> newUserInfo) {
        waitUntilElementVisible(addNewStudentMapping.getSaveButton());
        GlobalVariables.stringStringMap.put("code",newUserInfo.get("code"));
        GlobalVariables.stringStringMap.put("student name",newUserInfo.get("student name"));
        addNewStudentMapping.getCodeField().sendKeys(newUserInfo.get("code"));
        addNewStudentMapping.getStudentField().sendKeys(newUserInfo.get("student name"));
    }

    public boolean checkIfTheStudentAddedIsDisplayedInTheList(String studentCode, String studentName) {
        boolean status = false;
        for (MobileElement item : addNewStudentMapping.getStudentCodeAndNameList()){
            status = item.getText().contains(studentCode);
        }
        return status;
    }

    public ArrayList<String> getTheCurrentStudentList() {
        ArrayList<String> currentList = new ArrayList<>();
        waitUntilElementVisible(addNewStudentMapping.getSaveButton());
        for (MobileElement item : addNewStudentMapping.getStudentCodeAndNameList()){
            currentList.add(item.getText());
        }
        return currentList;
    }

    public boolean checkIfTheCurrentListContainAllOldStudents(ArrayList<String> oldStudentList) {
        boolean status = false;
        List<MobileElement> studentCodeAndNameList = addNewStudentMapping.getStudentCodeAndNameList();
        for(int i = 0; i < oldStudentList.size();i++){
            status = oldStudentList.contains(studentCodeAndNameList.get(i).getText());
        }
        return status;
    }

    public boolean checkIfTheCurrentListIsEqualToTheOldList(ArrayList<String> oldStudentList) {
        boolean status = false;
        List<MobileElement> studentCodeAndNameList = addNewStudentMapping.getStudentCodeAndNameList();
        for (MobileElement item : studentCodeAndNameList){
            status = oldStudentList.contains(item.getText()) && (oldStudentList.size() == studentCodeAndNameList.size());
        }
        return status;
    }

    public void fillTheFieldsWithAddedStudent() {
        waitUntilElementVisible(addNewStudentMapping.getCodeField());
        String code = addNewStudentMapping.getStudentCodeAndNameList().get(0).getText();
        addNewStudentMapping.getCodeField().sendKeys(code);
        addNewStudentMapping.getStudentField().sendKeys("Code of the first student");
    }

    public void addNewStudentByCredential(String code, String name) {
        waitUntilElementVisible(addNewStudentMapping.getSaveButton());
        addNewStudentMapping.getCodeField().sendKeys(code);
        addNewStudentMapping.getStudentField().sendKeys(name);
        addNewStudentMapping.getSaveButton().click();
    }
}
