package one.digitalinnovation.personapi.enums;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME( "Home"),
    MOBILE( "Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}

