job('dsl-to-start') {
  parameters {
    stringParam {
      name('PARAM_ONE')
      defaultValue('value 1')
      description('')
      trim(false)
    }
    booleanParam('FLAG', true)
    choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
  }
  steps {
    shell('echo "Hello world again")
  }
}
