package celestial;

/**
 * Builds the Discord RPC line that shows the server the player is currently
 * on. It is called from the patched {@code celestial.rrZP} on every presence
 * update (the RPC thread refreshes it every two seconds).
 *
 * <p>{@code rrfp_3.id_break()} returns the recognised server enum (the same
 * one {@code rrZP.id_native()} uses for the small image), and
 * {@code rrfp_3.id_throws()} returns the raw server address from
 * {@code ServerData}, or {@code "localhost"} for singleplayer and
 * {@code null} in the main menu.</p>
 */
public final class DiscordRpcServer {
    private static final String MENU_LINE = "Build \u00bb 1.1 (1.16.5)";

    private DiscordRpcServer() {
    }

    public static String line() {
        try {
            rrfq_3 server = rrfp_3.id_break();
            if (server != null) {
                return "\u0418\u0433\u0440\u0430\u0435\u0442 \u043d\u0430 " + displayName(server.name());
            }

            String address = rrfp_3.id_throws();
            if (address == null || address.isEmpty()) {
                return MENU_LINE;
            }
            if ("localhost".equalsIgnoreCase(address)) {
                return "\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u0430\u044f \u0438\u0433\u0440\u0430";
            }
            return "\u0421\u0435\u0440\u0432\u0435\u0440 \u00bb " + address;
        } catch (Throwable ignored) {
            // Never let presence updates crash the RPC thread.
            return MENU_LINE;
        }
    }

    private static String displayName(String enumName) {
        switch (enumName) {
            case "REALLY_WORLD":
                return "ReallyWorld";
            case "ARES_MINE":
                return "AresMine";
            case "FUNTIME":
                return "Funtime";
            case "FUNSKY":
                return "FunSky";
            case "SPOOKY_TIME":
                return "SpookyTime";
            case "SLIME_WORLD":
                return "SlimeWorld";
            case "HOLY_WORLD":
                return "HolyWorld";
            case "SUNRISE":
                return "Sunrise";
            case "INFINITY_HVH":
                return "InfinityHVH";
            case "META_HVH":
                return "MetaHVH";
            default:
                return enumName;
        }
    }
}