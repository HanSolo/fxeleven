module fxeleven {
    requires java.base;
    requires java.logging;
    requires eu.hansolo.tilesfx;
    requires eu.hansolo.medusa;

    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    exports eu.hansolo.fxeleven;
}