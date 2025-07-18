/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates.
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package software.amazon.keyspaces.streamsadapter.util;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Sleeper {

    public void sleep(long intervalInMillis) {
        try {
            Thread.sleep(intervalInMillis);
        } catch (InterruptedException ie) {
            log.debug("ThreadSleeper sleep was interrupted ", ie);
            Thread.currentThread().interrupt();
        }
    }

}