def call(){
    echo "Job Name:${env.JOB_NAME}"
    echo "Job Build_Number:${env.BUILD_NUMBER}"
    echo "Job Workspace Path:${env.WORKSPACE}"
}    