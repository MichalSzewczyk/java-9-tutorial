import com.mszewczyk.tutorial.implemented.SampleSerializable;

module first {
    // makes package accessible from all modules that requires this module
    exports com.mszewczyk.tutorial.exported.full;

    // makes package accessible from modules specified in "to" clause
    exports  com.mszewczyk.tutorial.exported to java.base;

    // grants reflective access for specified package
    opens com.mszewczyk.tutorial.opened;

    // declares modules that this module requires
    requires java.base;

    // any module which depends on current module will have implicit dependence on required module
    requires transitive java.compiler;

    // static makes dependence mandatory at compile-time but optional at runtime
    requires static java.instrument;

    // combination of the previous two
    requires transitive static java.logging;

            // declares interfaces from other modules that are used in this module
    uses java.util.Collection;

    // informs that the module provides implementation of interface with specified class
    provides java.io.Serializable with SampleSerializable;

}