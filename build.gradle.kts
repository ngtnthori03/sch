plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.ntzoe"
version = "0.1-SNAPSHOT"

javafx {
	version = "17"

	modules(
            "javafx.controls",
            "javafx.fxml",
            "javafx.swing",
            "javafx.media"
    )
}

repositories {
    mavenCentral()
}

application {
	mainClass = "org.ntzoe.sch.man.Entry"
}
