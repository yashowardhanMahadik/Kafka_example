#!/bin/bash

# Wait for Kafka to start
sleep 5

# Create a topic named 'text_stream' with 3 partitions and replication-factor of 1
docker exec kafka kafka-topics.sh --create --topic text_stream --partitions 3 --replication-factor 1 --bootstrap-server localhost:9092

# Display the details of the created topic
docker exec kafka kafka-topics.sh --describe --topic text_stream --bootstrap-server localhost:9092
