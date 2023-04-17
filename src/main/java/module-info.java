module com.tugalsan.api.servlet.charset.deprecated {
    requires javax.servlet.api;
    requires com.tugalsan.api.charset;
    requires com.tugalsan.api.runnable;
    requires com.tugalsan.api.log;
    requires com.tugalsan.api.unsafe;
    exports com.tugalsan.api.servlet.charset.deprecated.server;
}
