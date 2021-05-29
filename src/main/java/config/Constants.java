package config;

public interface Constants {

    interface Endpoints {
        String API_URL = "https://fierce-gorge-81903.herokuapp.com/api";
        String BROWSER_URL = "https://serene-mountain-14043.herokuapp.com/";
    }

    interface Ids {
        String HEADER = "header";
        String SEARCH_INPUT = "address";
        String SEARCH_BUTTON = "submit_3";
        String RESULT_TABLE = "//table/tbody/tr";
    }

    interface Stubs {
        String INVALID_PC = "EC1A 1BB";
        String NOT_FOUND_PC = "B99 9AA";
        String VALID_PC = "W6 0NW";
        String EMPTY_PC = "";
    }

    interface ErrorMessages {
        String INVALID_MESSAGE = "Postcode not valid.";
        String NOT_FOUND_MESSAGE = "Postcode not found!";
    }
}
