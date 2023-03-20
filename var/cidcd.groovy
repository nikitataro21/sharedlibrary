def newDownload(repo)
{
  git "https://github.com/nikitataro21/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
