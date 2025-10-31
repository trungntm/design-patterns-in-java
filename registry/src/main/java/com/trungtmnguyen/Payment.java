package com.trungtmnguyen;

import java.util.UUID;

public record Payment (UUID id, double amount, String currency) {

}
