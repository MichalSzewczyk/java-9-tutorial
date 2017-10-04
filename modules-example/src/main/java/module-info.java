module example {
    // have explicit dependencies to module's first dependencies
    requires transitive first;
    // provides implementation of interface from first module with implementation in example module
    provides com.mszewczyk.tutorial.exported.full.ExampleInterface with com.mszewczyk.tutorial.Example;
}