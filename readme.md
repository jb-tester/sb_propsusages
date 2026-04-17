## Configuration Properties navigation.

### Navigation by Navigate To Related symbol 

- from application.properties/application.yaml:
`Navigate to related symbol` action invoked in any place in this file
navigates to additional-spring-configuration-metadata.json if it exists, 
or doesn't work if no json exists
- from any usage in code:
navigates to application class, as for any place in class 

### Navigation by Ctrl-Click from application.properties/application.yaml:

- Properties, defined in the project `@ConfigurationProperties` beans:
  - Ctrl-Click navigates to setter/constructor in CP class
  - back navigation is possible via class method gutter
  - to usages - via the same gutter, or by Alt-F7
- Properties, defined in the project `additional-spring-configuration-metadata.json` file:
  - Ctrl-click navigates to json
  - It is impossible to navigate from json back to file or to usages
  - Navigation to usages - via Alt-F7, from the Find toolwindow only
- Properties, defined in the `application.properties`/`application.yaml` files only:
   - Ctrl-Click navigates to all usages
  - Ctrl-Click from any usage navigates back to application.*
- Library configuration properties:
  - Ctrl-Click navigates to class
  - It is impossible to navigate back (from class to properties/usages)
  - Navigation to usages - via Alt-F7, from the Find toolwindow only
  
### Navigation from the constructor/setters gutters in the @ConfigurationProperties class

 - Navigates to all usages of the property.
 - **Problems:**
   - no sorting by categories
   - inconsistent representation for application.properties vs application.yaml
   - inconsistent representation for usages in placeholders in all places vs in application.*
   - no navigation to usage in `@ConditionalOnProperty` in case of #prefix + #name attributes using
   
### Navigation from `additional-spring-configuration-metadata.json` file: 

Navigation is by any action (Ctrl-Click, Alt-F7, Navigate To Related Symbol) is not possible

### Navigation from library class that defines configuration property

Navigation to usages is not possible

### Navigation from usages in code/placeholders:

- to declarations in application.* for properties defined in `application.properties`/`application.yaml` files only
  - problem: inconsistent representation for properties in application.properties vs application.yaml
- to setter/constructor in `@ConfigurationProperties` class for properties defined in project/library CP bean
- to definition in `additional-spring-configuration-metadata.json` file for properties defined there
