/*
 * Copyright © 2016 Tinkoff Bank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.tinkoff.acquiring.sdk.responses;

import com.google.gson.annotations.SerializedName;

import ru.tinkoff.acquiring.sdk.CardStatus;

/**
 * @author Mikhail Artemyev
 */
final public class RemoveCardResponse extends AcquiringResponse {

    @SerializedName("CardId")
    private Long cardId;

    @SerializedName("CustomerKey")
    private String customerKey;

    @SerializedName("Status")
    private CardStatus status;

    public Long getCardId() {
        return cardId;
    }

    public String getCustomerKey() {
        return customerKey;
    }

    public CardStatus getStatus() {
        return status;
    }
}
