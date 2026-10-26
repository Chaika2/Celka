package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rgH_2 {
   OPEN_URL("open_url", true),
   OPEN_FILE("open_file", false),
   RUN_COMMAND("run_command", true),
   SUGGEST_COMMAND("suggest_command", true),
   CHANGE_PAGE("change_page", true),
   COPY_TO_CLIPBOARD("copy_to_clipboard", true),
   RUNNABLE("runnable", true);

   private static final Map<String, rgH_2> NAME_MAPPING = Arrays.stream(values()).collect(Collectors.toMap(rgH_2::break_, var0 -> (rgH_2)var0));
   private final boolean allowedInChat;
   private final String canonicalName;

   private rgH_2(String var3, boolean var4) {
      this.canonicalName = var3;
      this.allowedInChat = var4;
   }

   public static rgH_2 class_(String var0) {
      return NAME_MAPPING.get(var0);
   }

   public boolean class_() {
      return this.allowedInChat;
   }

   public String break_() {
      return this.canonicalName;
   }
}
