#!/usr/bin/env bash
java -cp Digital.jar:target/DigitalTest.jar de.neemann.digital.test.TestCircuit ../digital/src/main/dig/processor/Processor.dig ../digital/src/test/resources/programs/fibonacci.hex d.hex
