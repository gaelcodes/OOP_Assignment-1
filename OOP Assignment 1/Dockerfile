FROM openjdk:8

WORKDIR /app

COPY . .

# Compile all project classes (no package folders)
RUN javac HotelManagementSystem/src/*.java && \
    javac SiteConstructionManagementSystem/src/siteconstructionmanagementsystem/*.java && \
    javac TrafficFineManagementSystem/src/trafficfinemanagementsystem/*.java

# Make the entrypoint script executable
RUN chmod +x entrypoint.sh

# Use the script to control which app runs
ENTRYPOINT ["./entrypoint.sh"]
