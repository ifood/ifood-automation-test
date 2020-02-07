const wdio = require("webdriverio");

const opts = {
    port: 4723,
    capabilities: {
        platformName: "Android",
        platformVersion: "8",
        deviceName: "emulator-5554",
        app: "/home/rafael/Documentos/ifood-automation-test/ifood-test.apk",
        appPackage: "com.ifood.testqa",
        appActivity: "host.exp.exponent.MainActivity",
        automationName: "UiAutomator2",
        appWaitActivity: "host.exp.exponent.MainActivity",
    }
};

async function login(client, user_email, user_password) {
    try {
        let email = await client.$("//android.widget.EditText[1]");
        await email.setValue(`${user_email}`);

        let password = await client.$("//android.widget.EditText[2]");
        await password.setValue(`${user_password}`);

        let button = await client.$(".android.view.ViewGroup");
        await button.click();
    } catch (error) {
        console.log(`Login Error: ${error}`);
    }
};

async function setCod(client, cod){
    try {
        let code = await client.$("//android.widget.EditText[1]");
        await code.setValue(cod);
    } catch (error) {
        console.log(`Set Cod Error: ${error}`);
    }
};

async function setUser(client, name){
    try {
        let user = await client.$("//android.widget.EditText[2]");
        await user.setValue(name);
    } catch (error) {
        console.log(`Set User Name Error: ${error}`);
    }
};

async function save(client){
    let button = await client.$(".android.view.ViewGroup");
    await button.click();
}

async function cancel(client){
    let save = await client.$(".android.view.ViewGroup[2]");
    await save.click();
}

async function UserWasAdded(client, cod, name, index){
    android.widget.TextView
    await client.$(`//android.widget.TextView[${index}]`).isEqual(`${cod}-${name}`);
}

async function UserWasNotAdded(client, cod, name, index){
    android.widget.TextView
    await client.$(`//android.widget.TextView[${index}]`).isEqual(`${cod}-${name}`);
}

(async () => {
    const client = wdio.remote(opts);

    before:() => {
        login(client, 'teste@teste.com', '123456');
    }

    after:() => {
        client.deleteSession();
    }

    it('Add New User', async () => {
        await setCod(client, '121212');

        await setUser(client, 'Rafael Silva');

        await save(client);

        await UserWasAdded(client, '121212', 'Rafael Silva', 4);
    });

    it('Try to add an existing user', async () =>{
        await setCod(client, '98839');

        await setUser(client, 'Igor Resende');

        await save(client);

        await client.$("//android.widget.TextView[2]").isEqual("Já existe um aluno com este código!");
    });

    it('Try Cancel Add User', async () => {
        await setCod(client, '53456');

        await setUser(client, 'Rafael Fernandes');

        await cancel(client);
    });

    it('Try salve user with empty fields', async () => {
        await client.$("//android.widget.EditText[1]").isEqual(" ");
        await client.$("//android.widget.EditText[2]").isEqual(" ");
        await save(client);
        await client.$("android:id/alertTitle").isEqual("Os campos devem ser preenchidos!");
        await client.$('android:id/button1').click();
    });
})().catch((e) => console.error(e))
