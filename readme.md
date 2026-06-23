## Configuration Properties navigation.

### Navigation by Navigate To Related symbol 

- from application.properties/application.yaml:
`Navigate to related symbol` action invoked in any place in this file
navigates to additional-spring-configuration-metadata.json if it exists, 
or doesn't work if no json exists
- from any usage in code:
navigates to application class, as for any place in class 

### Navigation by Ctrl-Click from application.properties/application.yaml:
#### Initial behavior:
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


## Actual problems (after Spring Boot: config keys navigation popup ([IDEA-295733](https://youtrack.jetbrains.com/issue/IDEA-295733)) fix)

1. the usages from tests appear on top. It would be better to keep the definition place (`@ConfigurationProperties` class, or `additional-spring-configuration-metadata.json` ) on top.
2. the usage in the main application.properties files appears on the bottom of the list. It would be nice to show it above the usages (first position - property definition class/file, then the application.* files starting from the main, then - usages in other places)
3. the representation and behavior is different in case of properties defined in the application.* files only (see `local.prop1` property):
    - The Find Usages popup is shown for property key in application.* files; 
    - the similar keys in profile-specific files are not found;
    - the popup shown for the property usages display the keys with "property" icon, no Spring-specific ones; 
    - inconsistent representation b/w properties and yaml
4. the gutter navigation icon for constructor arguments in ctor-based `@ConfigurationProperties` doesn't show usages except the ones from application.* files.
   The gutter icon for setters in the setter-based `@ConfigurationProperties` displays all usages
5. for the keys defined in `additional-spring-configuration-metadata.json` the definition is displayed without file name in the navigation popup
6. it is still impossible to navigate from `additional-spring-configuration-metadata.json` back to application.*/usages
7. incorrect representation for prefix-less properties in the popup title in the configuration class (like `.property-name`)
8. it is still impossible to navigate back to application.*/usages from the library CP classes
9. the popup shown for the property usage displays invocation place in the usages list (the only exception is the popup for the CP class setter/ctor gutter)
10. inconsistent representation for usages in placeholders in all places vs in application.*
11. usage in `@ConditionalOnProperty` is not found in case of prefix+name separation
