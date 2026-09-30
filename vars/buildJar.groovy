def call ()
{
    echo "Building the application file for branch $BRANCH_NAME"
    sh "mvn package"

}
    
