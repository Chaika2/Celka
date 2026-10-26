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

public enum rrqM_2 implements MinecraftAccessor {
   private static String[] strings360b36d126ee3c45b942181ce786df43;
   public static Object[] staticFields360b36d126ee3c45b942181ce786df43;
   private static byte[] bytes360b36d126ee3c45b942181ce786df43;
   public Object[] fields360b36d126ee3c45b942181ce786df43;
   private static short[] shorts360b36d126ee3c45b942181ce786df43;
   private static boolean[] booleans360b36d126ee3c45b942181ce786df43;

   public Set<String> id_byte() {
      return (Set<String>)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[25]];
   }

   public void id_byte(String var1) {
      String var2 = this.id_protected(var1);
      if (var2 == null) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[9]]).forEach(var1x -> var1x.d_(var1));
      } else {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[10]])
            .forEach(var1x -> var1x.id_class(var2, booleans360b36d126ee3c45b942181ce786df43[1]));
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[11]]).remove(var2);
      }
   }

   private rrqM_2() {
      this.id_implements();
      HashSet var7 = new HashSet();
      this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[2]] = var8;
      this.id_class(new rrqh_3());
   }

   static {
      ntfClinit();
   }

   public void id_class(boolean var1) {
      if (((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[12]]).isEmpty()) {
         if (var1) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[13]]).forEach(rrqO_2::id_break);
         }
      } else {
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[14]]).clear();
         if (var1) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[15]]).forEach(rrqO_2::id_continue);
         }
      }
   }

   public void id_class(Consumer<String> var1) {
      if (((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[18]]).isEmpty()) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[19]]).forEach(rrqO_2::id_break);
      } else {
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[20]]).forEach(var1);
      }
   }

   public void id_class(String var1, boolean var2, boolean var3) {
      if (var1.length() > bytes360b36d126ee3c45b942181ce786df43[0] || var1.length() < bytes360b36d126ee3c45b942181ce786df43[1]) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[3]]).forEach(rrqO_2::aM_);
      } else if (var1.equalsIgnoreCase(id_import.id_while().id_byte())) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[4]]).forEach(rrqO_2::aN_);
      } else {
         if (var3) {
            for (String var5 : (Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[5]]) {
               if (var5.equalsIgnoreCase(var1.toLowerCase())) {
                  ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[6]])
                     .forEach(var1x -> var1x.d_(var1, booleans360b36d126ee3c45b942181ce786df43[2]));
                  return;
               }
            }
         }

         boolean var6 = ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[7]]).add(var1);
         if (var2) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[8]]).forEach(var2x -> var2x.d_(var1, var6));
         }
      }
   }

   public void id_class(rrqO_2 var1) {
      ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[21]]).add(var1);
   }

   public int id_class() {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[24]]).size();
   }

   public boolean id_class(String var1) {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[22]])
         .stream()
         .anyMatch(var1x -> var1x.equalsIgnoreCase(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2453120276632808051L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -634159326;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, 10, -31, -6, 104, -98, -32, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break() {
      rrwe_3 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts360b36d126ee3c45b942181ce786df43[16]]).id_throws();
      boolean var2 = var1.id_class((rrwU_2)var1.id_case(), booleans360b36d126ee3c45b942181ce786df43[0]);
      ((List)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[17]]).forEach(var1x -> var1x.f_(var2));
   }

   private static void id_throws() {
      shorts360b36d126ee3c45b942181ce786df43 = new short[]{1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0};
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrqM_2(), null};
      var0[1] = new rrqM_2[]{(rrqM_2)var0[0]};
      staticFields360b36d126ee3c45b942181ce786df43 = var0;
   }

   private static void id_catch() {
      bytes360b36d126ee3c45b942181ce786df43 = new byte[]{16, 2, 2, 2};
   }

   private static void id_extends() {
      booleans360b36d126ee3c45b942181ce786df43 = new boolean[]{false, true, false, true, false, false, false, true};
   }

   private void id_implements() {
      if (this.fields360b36d126ee3c45b942181ce786df43 == null) {
         this.fields360b36d126ee3c45b942181ce786df43 = new Object[2];
      }
   }

   public List<rrqO_2> id_protected() {
      return (List<rrqO_2>)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[26]];
   }

   public String id_protected(String var1) {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[shorts360b36d126ee3c45b942181ce786df43[23]])
         .stream()
         .filter(var1x -> var1x.equalsIgnoreCase(var1))
         .findFirst()
         .orElse(null);
   }

   private static void id_private() {
      strings360b36d126ee3c45b942181ce786df43 = new String[]{new String("INSTANCE")};
   }
}
