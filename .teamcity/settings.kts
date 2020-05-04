import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

version = "2019.2"

project {
    buildType(BuildyMcBuildFace)
}

object BuildyMcBuildFace : BuiltType ({
        id("Build")
        name = "Build"
        description = "Build Setting Test 123"

        steps {
            script {
                scriptContent = "echo 'Hello world!'"
            }
        }

        vcs {
            root(DslContext.settingsRoot)
        }

        triggers {
            vcs {
            }
        }
    }

    
})
