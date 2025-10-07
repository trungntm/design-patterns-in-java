package com.trungntm;

import java.util.UUID;

public record Payment (UUID id, double amount, String currency) {

}
