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
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   public T id_byte() {
      return (T)this.id_class[id_protected[19]];
   }

   public void id_byte(String var1) {
      this.id_class[id_protected[22]] = var1;
   }

   public Setting(String var1, T var2) {
      this.id_native();
      HashMap var8 = new HashMap();
      this.id_class[id_protected[0]] = var8;
      this.id_class[id_protected[1]] = var1;
      this.id_class[id_protected[2]] = var2;
      Supplier var11 = () -> id_break[4];
      this.id_class[id_protected[3]] = var11;

      for (int var3 = id_break[0]; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == id_byte[0]) {
            Integer var12 = (Integer)this.id_class[id_protected[4]] + id_break[1];
            this.id_class[id_protected[5]] = var12;
         }
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[2];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Setting var2 = (Setting)var1;
         return Objects.equals((String)this.id_class[id_protected[13]], (String)var2.id_class[id_protected[14]]);
      } else {
         return id_break[3];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((String)this.id_class[id_protected[15]]);
   }

   public void id_class(T var1, boolean var2, boolean var3) {
      this.id_class[id_protected[10]] = var1;
      if (var3 && !((Map)this.id_class[id_protected[11]]).isEmpty()) {
         for (Entry var5 : ((Map)this.id_class[id_protected[12]]).entrySet()) {
            ((BiConsumer)var5.getValue()).accept(this, Pair.of(var1, var2));
         }
      }
   }

   public <E extends Setting<E>> E id_class(String var1) {
      this.id_class[id_protected[9]] = var1;
      return (E)this;
   }

   public <E> E id_class(Supplier<Boolean> var1) {
      this.id_class[id_protected[8]] = var1;
      return (E)this;
   }

   public <E> E id_class(String var1, BiConsumer<Setting<T>, Pair<T, Boolean>> var2) {
      ((Map)this.id_class[id_protected[7]]).put(var1, var2);
      return (E)this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3455901325807538033L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1151630971;
   }

   private static void id_class() {
      id_protected = new short[]{4, 0, 3, 5, 2, 2, 5, 4, 5, 1, 3, 4, 4, 0, 0, 0, 0, 1, 2, 3, 4, 5, 0};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, -75, -107, -120, -101, 56, -61, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new byte[]{10, 6, 2};
   }

   public String id_throws() {
      return (String)this.id_class[id_protected[16]];
   }

   public String id_catch() {
      return (String)this.id_class[id_protected[17]];
   }

   private static void id_extends() {
      id_break = new boolean[]{false, true, true, false, true, false};
   }

   public Supplier<Boolean> id_case() {
      return (Supplier<Boolean>)this.id_class[id_protected[21]];
   }

   public int id_implements() {
      return (Integer)this.id_class[id_protected[18]];
   }

   public Map<String, BiConsumer<Setting<T>, Pair<T, Boolean>>> id_protected() {
      return (Map<String, BiConsumer<Setting<T>, Pair<T, Boolean>>>)this.id_class[id_protected[20]];
   }

   public boolean id_private() {
      return (Boolean)((Supplier)this.id_class[id_protected[6]]).get();
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
         var1[id_byte[2]] = Integer.valueOf(id_break[5]);
      }
   }
}
