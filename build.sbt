organization := "citywasp"
name := "citywasp-locations"

// no scala code here, so:
autoScalaLibrary := false // do not add scala as a dependency
crossPaths := false       // do not use scala version in artifact names

enablePlugins(GitVersioning)
git.useGitDescribe := true

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
