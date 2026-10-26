package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Shadow of the module settings container. The only behavioural change is the
 * {@link #b()} hook: whenever a module asks for its settings (click GUI build,
 * config load/save), the Attack Aura shield-break switch is renamed to
 * "ByPass SB". Everything else is a byte-for-byte behavioural copy of the
 * original class, so patching it is safe for every module.
 */
public abstract class rrwI_2 {
   public Object[] id_case;

   public rrwI_2() {
      this.id_catch();
      ArrayList var5 = new ArrayList();
      this.id_case[0] = var5;
   }

   public List<Setting<?>> b() {
      if (this instanceof AttackAura) {
         rrnD_2.shieldRenameHook((AttackAura)this);
      }

      return (List<Setting<?>>)this.id_case[0];
   }

   public <T extends Setting<?>> T id_class(T var1) {
      ((List)this.id_case[0]).add(var1);
      return var1;
   }

   public void id_class(Setting<?>... var1) {
      ((List)this.id_case[0]).addAll(Arrays.asList(var1));
   }

   public <T extends Setting<?>> T id_throws(String var1) {
      for (Object var3 : (List)this.id_case[0]) {
         Setting<?> var4 = (Setting<?>)var3;
         if (var4.id_throws().equalsIgnoreCase(var1.toLowerCase())) {
            return (T)var4;
         }
      }

      return null;
   }

   private void id_catch() {
      if (this.id_case == null) {
         this.id_case = new Object[1];
      }
   }

   public static String id_case(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, -39, -18, -114, -61, -87, 107, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract String id_synchronized();
}
