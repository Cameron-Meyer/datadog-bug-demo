Feature: Showing that the DD CI Visibility tracers gets a NPE on scenarios annotated with @setup

  @setup
  Scenario: This is the one
    * def data =
    """
    [
     {raB: "ooF"}
    ]
    """

  @withSetup
  Scenario Outline: This will not be able to retrieve setup().data
    * print raB
    Examples:
     | karate.setup().data |


  @withSetupOnce
  Scenario Outline: This will not be able to retrieve setupOnce().data
    * print raB
    Examples:
    | karate.setupOnce().data |