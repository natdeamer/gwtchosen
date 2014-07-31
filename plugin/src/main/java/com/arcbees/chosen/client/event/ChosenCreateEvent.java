/**
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.arcbees.chosen.client.event;

import com.arcbees.chosen.client.ChosenImpl;
import com.google.gwt.event.shared.EventHandler;

public class ChosenCreateEvent extends ChosenEvent<ChosenCreateEvent.ChosenCreateHandler> {

    public interface ChosenCreateHandler extends EventHandler {
        void onCreate(ChosenCreateEvent event);
    }

    public static Type<ChosenCreateHandler> getType() {
        return TYPE;
    }

    public static Type<ChosenCreateHandler> TYPE = new Type<ChosenCreateHandler>();

    private final String value;

    public ChosenCreateEvent(String value, ChosenImpl chosen) {
        super(chosen);
        this.value = value;
    }

    @Override
    public Type<ChosenCreateHandler> getAssociatedType() {
        return TYPE;
    }

    public String getValue() {
        return value;
    }

    @Override
    protected void dispatch(ChosenCreateHandler handler) {
        handler.onCreate(this);
    }

}
