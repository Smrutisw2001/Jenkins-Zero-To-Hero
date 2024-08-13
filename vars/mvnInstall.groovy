def call() {
  sh"java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn clean install"
}
