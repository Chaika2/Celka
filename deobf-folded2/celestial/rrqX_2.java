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

public enum rrqX_2 implements MinecraftAccessor {
   private static String[] strings25cb0eac93bd35f999c477f8effd8890;
   private static short[] shorts25cb0eac93bd35f999c477f8effd8890;
   private static byte[] bytes25cb0eac93bd35f999c477f8effd8890;
   private static boolean[] booleans25cb0eac93bd35f999c477f8effd8890;
   public Object[] fields25cb0eac93bd35f999c477f8effd8890;
   public static Object[] staticFields25cb0eac93bd35f999c477f8effd8890;

   public Set<String> id_byte() {
      return (Set<String>)this.fields25cb0eac93bd35f999c477f8effd8890[0];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{118, -16, -39, 21, -6, -124, -35, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rrqX_2() {
      this.id_catch();
      HashSet var7 = new HashSet();
      this.fields25cb0eac93bd35f999c477f8effd8890[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields25cb0eac93bd35f999c477f8effd8890[1] = var8;
      this.id_class(new rrqx_3());
   }

   static {
      ntfClinit();
   }

   public void id_class(boolean var1) {
      if (((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).isEmpty()) {
         if (var1) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(rrqJ_2::id_class);
         }
      } else {
         ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).clear();
         if (var1) {
            ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(rrqJ_2::id_this);
         }
      }
   }

   public void id_class(Consumer<String> var1) {
      if (((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).isEmpty()) {
         ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(rrqJ_2::id_class);
      } else {
         ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).forEach(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5675111461172160908L;
   }

   public void id_class(String var1, boolean var2, boolean var3) {
      if (var3) {
         for (String var5 : (Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]) {
            if (var5.equalsIgnoreCase(var1.toLowerCase())) {
               ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(var1x -> var1x.id_byte(var1, false));
               return;
            }
         }
      }

      boolean var6 = ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).add(var1);
      if (var2) {
         ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(var2x -> var2x.id_byte(var1, var6));
      }
   }

   public Set<String> id_class() {
      return (Set<String>)this.fields25cb0eac93bd35f999c477f8effd8890[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1841552635;
   }

   public void id_class(rrqJ_2 var1) {
      ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).add(var1);
   }

   public boolean id_class(String var1) {
      return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).stream().anyMatch(var1x -> var1x.equalsIgnoreCase(var1));
   }

   public String id_break(String var1) {
      return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).stream().filter(var1x -> var1x.equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public List<rrqJ_2> id_break() {
      return (List<rrqJ_2>)this.fields25cb0eac93bd35f999c477f8effd8890[1];
   }

   public int id_throws() {
      return ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).size();
   }

   private static void id_finally() {
      shorts25cb0eac93bd35f999c477f8effd8890 = new short[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
   }

   private void id_catch() {
      if (this.fields25cb0eac93bd35f999c477f8effd8890 == null) {
         this.fields25cb0eac93bd35f999c477f8effd8890 = new Object[2];
      }
   }

   private static void id_case() {
      strings25cb0eac93bd35f999c477f8effd8890 = new String[]{new String("INSTANCE")};
   }

   private static void id_implements() {
      bytes25cb0eac93bd35f999c477f8effd8890 = new byte[]{2, 2};
   }

   public void id_protected(String var1) {
      String var2 = this.id_break(var1);
      if (var2 == null) {
         ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(var1x -> var1x.c_(var1));
      } else {
         ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(var1x -> var1x.id_break(var2, true));
         ((Set)this.fields25cb0eac93bd35f999c477f8effd8890[0]).remove(var2);
      }
   }

   public void id_protected() {
      rrwe_3 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_throws();
      boolean var2 = var1.id_class((rrwU_2)var1.id_throws(), false);
      ((List)this.fields25cb0eac93bd35f999c477f8effd8890[1]).forEach(var1x -> var1x.e_(var2));
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrqX_2(), null};
      var0[1] = new rrqX_2[]{(rrqX_2)var0[0]};
      staticFields25cb0eac93bd35f999c477f8effd8890 = var0;
   }

   private static void id_native() {
      booleans25cb0eac93bd35f999c477f8effd8890 = new boolean[]{false, true, false, true, false, false, false, true};
   }
}
