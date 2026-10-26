package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bY_2 implements rr_3 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   @Override
   public boolean id_byte() {
      return !((List)this.id_class[2]).isEmpty() ? true : id_byte[10];
   }

   public bY_2(C_class var1) {
      this.id_finally();
      this.id_class[0] = var1;
      HashSet var7 = new HashSet();
      this.id_class[1] = var7;
      ArrayList var8 = new ArrayList();
      this.id_class[2] = var8;
      var1.s().id_class(new bo_3(this));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{59, -124, -104, 88, -35, -18, 59, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(rz_3 var1) {
      var1.id_protected();
      ((HashSet)this.id_class[1]).add(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1641658602;
   }

   @Override
   public HashSet<rz_3> id_class() {
      return (HashSet<rz_3>)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8082973147586416493L;
   }

   public boolean id_class(rP_2 var1) {
      Gh_1 var2 = ((C_class)this.id_class[0]).id_while().id_new();
      if (var2 != null) {
         if (var1.id_break(var2.id_class().id_protected())) {
            return false;
         } else {
            return !var1.equals(var2.id_class().id_byte()) ? true : id_byte[2];
         }
      } else {
         return id_byte[3];
      }
   }

   public boolean id_break(rP_2 var1) {
      Gh_1 var2 = ((C_class)this.id_class[0]).id_while().id_new();
      if (var2 != null) {
         rP_2 var3 = var2.id_class().id_byte();
         rU_2 var4 = var2.id_class().id_protected();
         if (var3.id_break(var4) && !var1.id_break(var4)) {
            return true;
         }
      }

      return id_byte[5];
   }

   @Override
   public Optional<rn_3> id_break() {
      return Optional.ofNullable((rn_3)this.id_class[5]);
   }

   @Override
   public rz_3 id_throws() {
      return this.id_class().stream().filter(rz_3::id_byte).findFirst().orElse(null);
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
      }
   }

   public void id_catch() {
      rz_3 var6 = (rz_3)this.id_class[4];
      this.id_class[3] = var6;
      Object var7 = null;
      this.id_class[4] = var7;
      BO var1 = ((C_class)this.id_class[0]).id_while();
      rn_3 var8 = this.id_private();
      this.id_class[5] = var8;
      if ((rn_3)this.id_class[5] == null) {
         var1.id_synchronized();
         var1.id_class(null);
      } else {
         if (!Objects.equals((rz_3)this.id_class[4], (rz_3)this.id_class[3])
            && (rC_2)((rn_3)this.id_class[5]).id_class[1] != (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]
            && (rz_3)this.id_class[3] != null
            && !((rz_3)this.id_class[3]).id_catch()) {
            var1.id_synchronized();
         }

         switch (((int[])bK_2.id_class[0])[((rC_2)((rn_3)this.id_class[5]).id_class[1]).ordinal()]) {
            case 1:
               var1.id_final();
               break;
            case 2:
               var1.id_class((rP_2)((rn_3)this.id_class[5]).id_class[0]);
               var1.id_synchronized();
               break;
            case 3:
               if (!var1.id_catch() && !var1.id_case().isPresent()) {
                  var1.id_class((rn_3)this.id_class[5]);
               }
               break;
            case 4:
               if (!var1.id_catch() && !var1.id_case().isPresent()) {
                  var1.id_class((rn_3)this.id_class[5]);
               }
               break;
            case 5:
               if ((rP_2)((rn_3)this.id_class[5]).id_class[0] != null) {
                  ((C_class)this.id_class[0]).id_while().id_class((rn_3)this.id_class[5]);
               }
               break;
            default:
               throw new IllegalStateException();
         }
      }
   }

   private static void id_extends() {
      id_break = new short[]{
         0,
         1,
         2,
         1,
         0,
         3,
         4,
         5,
         2,
         1,
         4,
         5,
         4,
         3,
         4,
         0,
         5,
         5,
         4,
         3,
         5,
         1,
         1,
         3,
         3,
         0,
         5,
         1,
         5,
         0,
         5,
         5,
         5,
         0,
         0,
         5,
         5,
         0,
         0,
         5,
         1,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         0,
         1,
         2,
         2,
         2,
         2,
         2,
         3,
         0,
         0,
         1,
         5,
         4,
         1,
         2
      };
   }

   public void id_case() {
      ((C_class)this.id_class[0]).s().id_native();
      Object var7 = null;
      this.id_class[3] = var7;
      Object var8 = null;
      this.id_class[4] = var8;
      Object var9 = null;
      this.id_class[5] = var9;
      ((List)this.id_class[2]).clear();

      for (rz_3 var2 : (HashSet)this.id_class[1]) {
         var2.id_protected();
         if (var2.id_byte() && !var2.id_catch()) {
            throw new IllegalStateException(var2.id_break());
         }
      }
   }

   private static void id_implements() {
      id_protected = new byte[]{6};
   }

   @Override
   public Optional<rz_3> id_protected() {
      return Optional.ofNullable((rz_3)this.id_class[4]);
   }

   public rn_3 id_private() {
      for (rz_3 var2 : (HashSet)this.id_class[1]) {
         if (var2.id_byte()) {
            if (!((List)this.id_class[2]).contains(var2)) {
               ((List)this.id_class[2]).add(0, var2);
            }
         } else {
            ((List)this.id_class[2]).remove(var2);
         }
      }

      ((List)this.id_class[2]).sort(Comparator.comparingDouble(rz_3::id_case).reversed());
      Iterator var9 = ((List)this.id_class[2]).iterator();

      while (var9.hasNext()) {
         rz_3 var10 = (rz_3)var9.next();
         rn_3 var3 = var10.id_class(
            Objects.equals(var10, (rz_3)this.id_class[3]) && ((C_class)this.id_class[0]).id_while().id_int() ? true : id_byte[8],
            ((C_class)this.id_class[0]).id_while().id_else()
         );
         if (var3 == null) {
            if (var10.id_byte()) {
               throw new IllegalStateException(var10.id_break() + " actively returned null PathingCommand");
            }
         } else if ((rC_2)var3.id_class[1] != (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[5]) {
            this.id_class[4] = var10;
            if (!var10.id_catch()) {
               var9.forEachRemaining(rz_3::id_protected);
            }

            return var3;
         }
      }

      return null;
   }

   void id_volatile() {
      if ((rn_3)this.id_class[5] != null) {
         BO var1 = ((C_class)this.id_class[0]).id_while();
         switch (((int[])bK_2.id_class[0])[((rC_2)((rn_3)this.id_class[5]).id_class[1]).ordinal()]) {
            case 3:
               if ((rP_2)((rn_3)this.id_class[5]).id_class[0] == null
                  || this.id_class((rP_2)((rn_3)this.id_class[5]).id_class[0])
                  || this.id_break((rP_2)((rn_3)this.id_class[5]).id_class[0])) {
                  var1.id_this();
               }

               var1.id_class((rn_3)this.id_class[5]);
               break;
            case 4:
               if ((Boolean)C_class.id_instanceof().Pb.id_class[0]
                  && ((rP_2)((rn_3)this.id_class[5]).id_class[0] == null || this.id_break((rP_2)((rn_3)this.id_class[5]).id_class[0]))) {
                  var1.id_this();
               }

               var1.id_class((rn_3)this.id_class[5]);
         }
      }
   }

   private static void id_native() {
      id_byte = new boolean[]{false, true, false, false, true, false, false, true, false, true, false};
   }
}
