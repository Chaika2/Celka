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

public enum rrje_3 {
   ;
   private static String[] strings67a5399629443d9d93e54c2de6d74063;
   private static byte[] bytes67a5399629443d9d93e54c2de6d74063;
   public Object[] fields67a5399629443d9d93e54c2de6d74063;
   public static Object[] staticFields67a5399629443d9d93e54c2de6d74063;
   private static short[] shorts67a5399629443d9d93e54c2de6d74063;
   private static boolean[] booleans67a5399629443d9d93e54c2de6d74063;

   public Set<rrjD_2> byte_() {
      return (Set<rrjD_2>)this.fields67a5399629443d9d93e54c2de6d74063[0];
   }

   public rrjD_2 byte_(String var1) {
      return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).stream().filter(var1x -> var1x.byte_().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   private rrje_3() {
      this.catch_();
      HashSet var7 = new HashSet();
      this.fields67a5399629443d9d93e54c2de6d74063[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields67a5399629443d9d93e54c2de6d74063[1] = var8;
      ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).add(new rrji_3());
   }

   static {
      ntfClinit();
   }

   public void class_(rrja_3 var1) {
      ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).add(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 339644560;
   }

   public boolean class_(rrjD_2 var1, boolean var2) {
      if (this.protected_(var1.byte_())) {
         this.break_(var1.byte_(), false);
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(var1x -> var1x.class_(var1));
         var2 = false;
      }

      boolean var3 = ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).add(var1);
      if (var2) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(var2x -> var2x.break_(var1, var3));
      }

      return var3;
   }

   public boolean class_(rja_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (rrjD_2 var3 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[0]) {
            eX_2 var4 = var3.break_();
            if (var4 != null) {
               int var5 = (int)var4.class_();
               int var6 = (int)var4.break_();
               int var7 = (int)var4.byte_();
               if (var5 == var1.b_() && var6 == var1.c_() && var7 == var1.d_()) {
                  return true;
               }
            }
         }

         return booleans67a5399629443d9d93e54c2de6d74063[7];
      }
   }

   public void class_(Consumer<rrjD_2> var1) {
      if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).isEmpty()) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(rrja_3::class_);
      } else {
         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).forEach(var1);
      }
   }

   public String class_(String var1) {
      return this.class_(var1, false);
   }

   public String class_(String var1, boolean var2) {
      String var3 = var1;
      int var4 = 1;

      while (this.protected_(var3) && !var2) {
         var3 = String.format(var1 + " %d", ++var4);
      }

      return var3;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5078802630424218111L;
   }

   public void class_() {
      if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).isEmpty()) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(rrja_3::class_);
      } else {
         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).clear();
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(rrja_3::super_);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -68, 4, 51, 74, 63, 36, -59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(String var1, boolean var2) {
      rrjD_2 var3 = this.byte_(var1);
      if (var3 == null) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(var1x -> var1x.b_(var1));
      } else {
         if (var2) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[1]).forEach(var3x -> var3x.class_(var3, this.protected_(var1)));
         }

         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).removeIf(var1x -> var1x.byte_().equalsIgnoreCase(var1));
      }
   }

   public boolean break_() {
      return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).isEmpty();
   }

   private static void throws_() {
      shorts67a5399629443d9d93e54c2de6d74063 = new short[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0};
   }

   private void catch_() {
      if (this.fields67a5399629443d9d93e54c2de6d74063 == null) {
         this.fields67a5399629443d9d93e54c2de6d74063 = new Object[2];
         Object[] var1 = this.fields67a5399629443d9d93e54c2de6d74063;
      }
   }

   private static void extends_() {
      strings67a5399629443d9d93e54c2de6d74063 = new String[]{new String("INSTANCE")};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrje_3(), null};
      var0[1] = new rrje_3[]{(rrje_3)var0[0]};
      staticFields67a5399629443d9d93e54c2de6d74063 = var0;
   }

   private static void implements_() {
      booleans67a5399629443d9d93e54c2de6d74063 = new boolean[]{
         false, false, false, true, false, false, true, false, false, true, true, false, true, false, false, false, true
      };
   }

   public boolean protected_(String var1) {
      if (!rql_3.break_(var1) && !((Set)this.fields67a5399629443d9d93e54c2de6d74063[0]).isEmpty()) {
         for (rrjD_2 var3 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[0]) {
            if (var3.byte_().equalsIgnoreCase(var1)) {
               return true;
            }
         }

         return booleans67a5399629443d9d93e54c2de6d74063[4];
      } else {
         return booleans67a5399629443d9d93e54c2de6d74063[2];
      }
   }

   public List<rrja_3> protected_() {
      return (List<rrja_3>)this.fields67a5399629443d9d93e54c2de6d74063[1];
   }

   private static void private_() {
      bytes67a5399629443d9d93e54c2de6d74063 = new byte[]{2, 2};
   }
}
