### Simple two page app created with ttcli

```bash
ttcli init
? Group:  com.example
? Artifact:  redirect-reproducer
? Project Name:  Demo
? Select Spring Boot version 3.3.0
? Select live reload implementation: npm-based-with-tailwind-css
? Web dependencies alpinejs,htmx
? Tailwind dependencies daisy-ui,forms
🍃 Generating Spring Boot project
🛠️  Using node v21.6.1 with npm 10.2.4
🔨 Installing npm dependencies
👷‍♂️ Adding npm build scripts
👷🏻‍♀️ Updating Maven pom.xml
🔨 Installing npm dependencies
✅ Done generating project at /Users/../Git/./redirect-reproducer

See HELP.md in the generated project for additional information.
```

To reproduce : 

`mvn clean package`

Create a run configuration to start the Spring Boot server with `local` profile:

Used run config:

```xml
<component name="ProjectRunConfigurationManager">
  <configuration default="false" name="Unnamed" type="Application" factoryName="Application" nameIsGenerated="true">
    <envs>
      <env name="spring.profiles.active" value="local" />
    </envs>
    <option name="MAIN_CLASS_NAME" value="com.example.redirect_reproducer.DemoApplication" />
    <module name="redirect-reproducer" />
    <method v="2">
      <option name="Make" enabled="true" />
    </method>
  </configuration>
</component>
```

Startup live reload with:

`npm run build && npm run watch`