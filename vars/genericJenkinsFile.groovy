def call(def buildMode="mvn",def jira_issue=""){
    pipeline{
        agent any
    }

    options{}

    parameters{}

    environment{}

    stages{
        stage("Initialize"){
            steps{
                echo "Intializing..!"
            }
            post{
                success{
                    echo "JIRA: Initialize Successful"
                }
                failure{
                    echo "JIRA: Initialize Failed"
                }
            }
        }
        stage("Update Dependencies"){
            steps{
                echo "Updating..!"
            }
            post{
                success{
                    echo "JIRA: Update Successful"
                }
                failure{
                    echo "JIRA: Update Failed"
                }
            }
        }
        stage("Build"){
            steps{
                echo "Building..!"
            }
            post{
                success{
                    echo "JIRA: Build Successful"
                }
                failure{
                    echo "JIRA: Build Failed"
                }
            }
        }
        stage("Unit Tests"){
            steps{
                echo "Unit Testing..!"
            }
            post{
                success{
                    echo "JIRA: Unit Tests Successful"
                }
                failure{
                    echo "JIRA: Unit Tests Failed"
                }
            }
        }
        stage("Unit Tests"){
            steps{
                echo "Unit Testing..!"
            }
            post{
                success{
                    echo "JIRA: Unit Tests Successful"
                }
                failure{
                    echo "JIRA: Unit Tests Failed"
                }
            }
        }
        stage("Install"){
            steps{
                echo "Installing..!"
            }
            post{
                success{
                    echo "JIRA: Install Successful"
                }
                failure{
                    echo "JIRA: Install Failed"
                }
            }
        }
        stage("Scoverage Report"){
            steps{
                echo "Reports running..!"
            }
            post{
                success{
                    echo "JIRA: S Report Successful"
                }
                failure{
                    echo "JIRA: S Report Failed"
                }
            }
        }
        stage("Run Sonar"){
            steps{
                echo "Reports running..!"
            }
            post{
                success{
                    echo "JIRA: S Report Successful"
                }
                failure{
                    echo "JIRA: S Report Failed"
                }
            }
        }
        stage("Integration Test"){
            steps{
                echo "Integration Testing..!"
            }
            post{
                success{
                    echo "JIRA: Integration Tests Successful"
                }
                failure{
                    echo "JIRA: Integration Tests Failed"
                }
            }
        }
        stage("Close artificat version"){
            steps{
                echo "Close artificat version..!"
            }
            post{
                success{
                    echo "JIRA: Close artificat version Successful"
                }
                failure{
                    echo "JIRA: Close artificat version Failed"
                }
            }
        }
        stage("Artifactory + Docker + Package"){
            steps{
                echo "ADP ing..!"
            }
            post{
                success{
                    echo "JIRA: ADP Successful"
                }
                failure{
                    echo "JIRA: ADP Failed"
                }
            }
        }
        stage("Deploy to INT"){
            steps{
                echo "Deploying..!"
            }
            post{
                success{
                    echo "JIRA: Deployment Successful"
                }
                failure{
                    echo "JIRA: Deployment Failed"
                }
            }
        }
        stage("Performance Test"){
            steps{
                echo "Performance Testing..!"
            }
            post{
                success{
                    echo "JIRA: Performance Testing Successful"
                }
                failure{
                    echo "JIRA: Performance Testing Failed"
                }
            }
        }
        stage("Staging Test"){
            steps{
                echo "Staging..!"
            }
            post{
                success{
                    echo "JIRA: Staging Test Successful"
                }
                failure{
                    echo "JIRA: Staging Test Failed"
                }
            }
        }
    }
    post{
        always{
            echo "JIRA: Added BDD test reports"
        }
        cleanup{}
    }
}