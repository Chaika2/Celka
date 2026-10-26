package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrvZ implements MinecraftAccessor {
   public static Object[] staticFieldse90af7ec3c763bb3bd1d99a27ea561d9;
   private static byte[] bytese90af7ec3c763bb3bd1d99a27ea561d9;
   private static boolean[] booleanse90af7ec3c763bb3bd1d99a27ea561d9;
   private static String[] stringse90af7ec3c763bb3bd1d99a27ea561d9;
   public Object[] fieldse90af7ec3c763bb3bd1d99a27ea561d9;
   private static short[] shortse90af7ec3c763bb3bd1d99a27ea561d9;

   public void id_byte(String var1) {
      ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(var1x -> var1x.id_break(var1));
   }

   public Set<rrvm_1> id_byte() {
      return (Set<rrvm_1>)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1];
   }

   private rrvZ() {
      this.id_finally();
      Consumer var7 = var0 -> {
      };
      this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[0] = var7;
      HashSet var8 = new HashSet();
      this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1] = var8;
      ArrayList var9 = new ArrayList();
      this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2] = var9;
      ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).add(new rrvF());
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5726943537245716637L;
   }

   public void id_class() {
      if (((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).isEmpty()) {
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(rrvv_1::id_byte);
      } else {
         ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).clear();
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(rrvv_1::id_break);
      }
   }

   public void id_class(int var1) {
      for (rrvm_1 var3 : this.id_byte()) {
         if (var3.id_class().id_byte() == var1) {
            ((cb_3)id_import.id_class[57]).id_protected(var3.id_break());
         }
      }

      ((Consumer)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).accept(var1);
   }

   public void id_class(rrvm_1 var1, boolean var2) {
      ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).add(var1);
      if (var2) {
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(var1x -> var1x.id_class(var1));
      }
   }

   public void id_class(Consumer<rrvm_1> var1) {
      if (((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).isEmpty()) {
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(rrvv_1::id_byte);
      } else {
         ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).forEach(var1);
      }
   }

   public boolean id_class(String var1) {
      return this.id_throws(var1) != null ? true : booleanse90af7ec3c763bb3bd1d99a27ea561d9[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 483236896;
   }

   public void id_break(Consumer<Integer> var1) {
      this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[0] = var1;
   }

   public void id_break() {
      ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(rrvv_1::id_class);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -102, 96, -6, 19, -38, -79, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rrvm_1 id_throws(String var1) {
      return var1 != null && !var1.isEmpty() && !((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).isEmpty()
         ? ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).stream().filter(var1x -> var1x.id_byte().equalsIgnoreCase(var1)).findFirst().orElse(null)
         : null;
   }

   private static void id_throws() {
      bytese90af7ec3c763bb3bd1d99a27ea561d9 = new byte[]{3, 2};
   }

   private void id_finally() {
      if (this.fieldse90af7ec3c763bb3bd1d99a27ea561d9 == null) {
         this.fieldse90af7ec3c763bb3bd1d99a27ea561d9 = new Object[3];
         Object[] var1 = this.fieldse90af7ec3c763bb3bd1d99a27ea561d9;
      }
   }

   private static void id_catch() {
      shortse90af7ec3c763bb3bd1d99a27ea561d9 = new short[]{1, 0, 1, 2, 2, 1, 2, 0, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 57, 0, 2, 2, 1, 1, 1, 0, 0};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrvZ(), null};
      var0[1] = new rrvZ[]{(rrvZ)var0[0]};
      staticFieldse90af7ec3c763bb3bd1d99a27ea561d9 = var0;
   }

   private static void id_implements() {
      booleanse90af7ec3c763bb3bd1d99a27ea561d9 = new boolean[]{true, false, true, false, false, false, true};
   }

   public void id_protected(String var1) {
      rrvm_1 var2 = ((rrvZ)staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_throws(var1);
      if (var2 == null) {
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(var1x -> var1x.id_class(var1));
      } else {
         ((List)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[2]).forEach(var3 -> var3.id_class(var2, this.id_class(var1)));
         ((Set)this.fieldse90af7ec3c763bb3bd1d99a27ea561d9[1]).removeIf(var1x -> var1x.id_byte().equalsIgnoreCase(var1.toLowerCase()));
      }
   }

   private static void id_private() {
      stringse90af7ec3c763bb3bd1d99a27ea561d9 = new String[]{new String("INSTANCE")};
   }
}
