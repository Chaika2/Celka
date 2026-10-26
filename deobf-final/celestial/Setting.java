package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Setting<T> {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;

   public T byte_() {
      return (T)this.class_[3];
   }

   public void byte_(String var1) {
      this.class_[0] = var1;
   }

   public Setting(String var1, T var2) {
      this.native_();
      HashMap var8 = new HashMap();
      this.class_[4] = var8;
      this.class_[0] = var1;
      this.class_[3] = var2;
      Supplier var11 = () -> true;
      this.class_[5] = var11;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == '\n') {
            Integer var12 = (Integer)this.class_[2] + 1;
            this.class_[2] = var12;
         }
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Setting var2 = (Setting)var1;
         return Objects.equals((String)this.class_[0], (String)var2.class_[0]);
      } else {
         return break_[3];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((String)this.class_[0]);
   }

   public void class_(T var1, boolean var2, boolean var3) {
      this.class_[3] = var1;
      if (var3 && !((Map)this.class_[4]).isEmpty()) {
         for (Entry var5 : ((Map)this.class_[4]).entrySet()) {
            ((BiConsumer)var5.getValue()).accept(this, Pair.of(var1, var2));
         }
      }
   }

   public <E extends Setting<E>> E class_(String var1) {
      this.class_[1] = var1;
      return (E)this;
   }

   public <E> E class_(Supplier<Boolean> var1) {
      this.class_[5] = var1;
      return (E)this;
   }

   public <E> E class_(String var1, BiConsumer<Setting<T>, Pair<T, Boolean>> var2) {
      ((Map)this.class_[4]).put(var1, var2);
      return (E)this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3455901325807538033L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1151630971;
   }

   private static void class_() {
      protected_ = new short[]{4, 0, 3, 5, 2, 2, 5, 4, 5, 1, 3, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 5, 0};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, -75, -107, -120, -101, 56, -61, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new byte[]{10, 6, 2};
   }

   public String throws_() {
      return (String)this.class_[0];
   }

   public String catch_() {
      return (String)this.class_[1];
   }

   private static void extends_() {
      break_ = new boolean[]{false, true, true, false, true, false};
   }

   public Supplier<Boolean> case_() {
      return (Supplier<Boolean>)this.class_[5];
   }

   public int implements_() {
      return (Integer)this.class_[2];
   }

   public Map<String, BiConsumer<Setting<T>, Pair<T, Boolean>>> protected_() {
      return (Map<String, BiConsumer<Setting<T>, Pair<T, Boolean>>>)this.class_[4];
   }

   public boolean private_() {
      return (Boolean)((Supplier)this.class_[5]).get();
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }
}
