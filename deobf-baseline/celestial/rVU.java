package celestial;

public enum rVU {
   CHAT((byte)0, false),
   SYSTEM((byte)1, true),
   GAME_INFO((byte)2, true);

   private final byte id;
   private final boolean interrupts;

   private rVU(byte var3, boolean var4) {
      this.id = var3;
      this.interrupts = var4;
   }

   public static rVU id_class(byte var0) {
      for (rVU var4 : values()) {
         if (var0 == var4.id) {
            return var4;
         }
      }

      return CHAT;
   }

   public byte id_class() {
      return this.id;
   }

   public boolean id_break() {
      return this.interrupts;
   }
}
