/**
 * Copyright 2018 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.api;

import org.reactivestreams.Publisher;

/**
 * {@link java.util.Queue} backed by Redis
 *
 * @author Nikita Koksharov
 *
 * @param <V> the type of elements held in this collection
 */
public interface RQueueReactive<V> extends RCollectionReactive<V> {

    Publisher<V> peek();

    Publisher<V> poll();

    Publisher<Boolean> offer(V e);

    Publisher<V> pollLastAndOfferFirstTo(String queueName);

}
