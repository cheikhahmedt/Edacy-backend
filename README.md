# Edacy-backend
Node is required for generation and recommended for development. package.json is always generated for a better development experience with prettier, commit hooks, scripts and so on.
In the project root, JHipster generates configuration files for tools like git, prettier, eslint, husky, and others that are well known and you can find references in the web.
/src/* structure follows default Java structure.


/src/main/docker - Docker configurations for the application and services that the application depends on



Development
Before you can build this project, you must install and configure the following dependencies on your machine:


Node.js: We use Node to run a development web server and build the project.
Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in package.json.
npm install
We use npm scripts and Angular CLI with Webpack as our build system.
Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.
./mvnw
npm start
