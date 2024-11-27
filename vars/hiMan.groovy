def call() {
  sh ''' gcloud auth activate-service-account --key-file=${SERVICE_ACCOUNT_JSON}
                        gcloud config set project ${PROJECT_ID}
                        gcloud auth configure-docker --quiet
                        docker build -t ${IMAGE_NAME_QA} .
          '''
}
