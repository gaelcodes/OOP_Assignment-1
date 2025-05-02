#!/bin/bash

case "$1" in
  hotel)
    java -cp HotelManagementSystem/src Main
    ;;
  site)
    java -cp SiteConstructionManagementSystem/src siteconstructionmanagementsystem.Main
    ;;
  traffic)
    java -cp TrafficFineManagementSystem/src trafficfinemanagementsystem.Main
    ;;
  *)
    echo "Usage: docker run <image> {hotel|site|traffic}"
    exit 1
    ;;
esac
# This script is used to run different Java applications based on the argument passed to the Docker container.
# Note: The above command assumes that the main class for each system is named 'Main' and is located in the respective package.
# You may need to adjust the classpath and main class names based on your actual project structure.
# Ensure that the Java application is running in the foreground
# to keep the Docker container alive. This is typically done by not using '&' at the end of the command.