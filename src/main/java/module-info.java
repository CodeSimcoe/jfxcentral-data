open module jfxcentral.data {

    requires com.rometools.rome;
    requires com.google.gson;
    requires org.apache.commons.lang3;
    requires gson.javatime.serialisers;
    requires javafx.graphics;
    requires java.logging;

    exports com.dlsc.jfxcentral.data;
    exports com.dlsc.jfxcentral.data.pull;
    exports com.dlsc.jfxcentral.data.model;
}