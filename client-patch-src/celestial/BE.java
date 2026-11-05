package celestial;

/**
 * Client patch: the original handler opened the Telegram, Discord and VK
 * links in the system browser as soon as the client loaded. The registration
 * side (constructor) is kept intact so nothing else breaks, but the handler
 * itself does nothing now.
 */
public class BE extends Pv_1 {
   public BE(C_class var1) {
      super(var1);
   }

   @Override
   public void id_class(rrFU var1) {
      // Link auto-open intentionally disabled.
   }
}
