job('dsl-to-start') {
  parameters {
    stringParam {
      name('PARAM_ONE')
      defaultValue('value 1')
      description('')
      trim(false)
    }
  }
  steps {
    shell('echo "Hello"')
  }
}
