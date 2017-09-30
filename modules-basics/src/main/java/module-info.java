import com.mszewczyk.tutorial.implemented.SampleSerializable;

module first {
    // makes package accessible from modules that requires this module
    exports com.mszewczyk.tutorial.exported;

    // grants reflective access for specified package
    opens com.mszewczyk.tutorial.opened;

    // declares modules that this module requires
    requires java.base;

    // declares interfaces from other modules that are used in this module
    uses java.util.Collection;

    // informs that the module provides implementation of interface with specified class
    provides java.io.Serializable with SampleSerializable;
}