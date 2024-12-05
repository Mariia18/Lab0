package lab0;

public @interface Test {
    boolean enabled();

    String dataProvider();

    Class<AssertionError> expectedExceptions();
}
