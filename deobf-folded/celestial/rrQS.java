package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQS {
   private static String[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static long[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_class = new String[]{
         new String("%n"),
         new String("[Local File Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    Version     :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLength  :       %#6x    [%s]%n"),
         new String("    ExtraLength :       %#6x%n"),
         new String("[Central Directory Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    VerMadeby   :       %#6x    [%d, %d.%d]%n"),
         new String("    VerExtract  :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLen     :       %#6x    [%s]%n"),
         new String("    ExtraLen    :       %#6x%n"),
         new String("    CommentLen  :       %#6x%n"),
         new String("    DiskStart   :       %#6x%n"),
         new String("    Attrs       :       %#6x%n"),
         new String("    AttrsEx     :   %#10x%n"),
         new String("    LocOff      :   %#10x%n"),
         new String("        [tag=0x%04x, sz=%d, data= "),
         new String("    Error: Invalid extra data, beyond extra length"),
         new String("%02x "),
         new String("]%n"),
         new String("         ->ZIP64: "),
         new String(" *0x%x "),
         new String("%n"),
         new String("         ->PKWare NTFS%n"),
         new String("    Error: Invalid NTFS sub-tag or subsz"),
         new String("            mtime:%tc%n"),
         new String("            atime:%tc%n"),
         new String("            ctime:%tc%n"),
         new String("         ->Info-ZIP Extended Timestamp: flag=%x%n"),
         new String("            *%tc%n"),
         new String("         ->[tag=%x, size=%d]%n")
      };
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -323628407;
   }

   private static long id_class(byte[] var0, int var1) {
      long var2 = rrzH_2.id_throw(var0, var1);
      if (var2 == 4294967295L) {
         int var4 = var1 + 46 + rrzH_2.id_super(var0, var1);
         int var5 = var4 + rrzH_2.id_instanceof(var0, var1);

         while (var4 + 4 < var5) {
            int var6 = rrzH_2.id_while(var0, var4);
            int var7 = rrzH_2.id_while(var0, var4 + 2);
            if (var6 == 1) {
               var4 += 4;
               if (rrzH_2.id_int(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               if (rrzH_2.id_finally(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               return rrzH_2.id_catch(var0, var4);
            }

            var4 += 4 + var7;
         }
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3078213705303344848L;
   }

   private static void id_class(String var0, Object... var1) {
      System.out.printf(var0, var1);
   }

   private static void id_class() {
      id_byte = new short[]{10, 12, 255, 255};
   }

   private static void id_class(byte[] var0, int var1, int var2) {
      int var3 = var1 + var2;

      while (var1 + 4 <= var3) {
         int var4 = rrzH_2.id_while(var0, var1);
         int var5 = rrzH_2.id_while(var0, var1 + 2);
         String var10000 = id_class[31];
         Object[] var10001 = new Object[2];
         var10001[id_throws[58]] = var4;
         var10001[1] = var5;
         id_class(var10000, var10001);
         if (var1 + var5 > var3) {
            id_class(id_class[32]);
            break;
         }

         var1 += 4;

         for (int var6 = id_throws[61]; var6 < var5; var6++) {
            var10000 = id_class[33];
            var10001 = new Object[1];
            var10001[id_throws[63]] = var0[var1 + var6];
            id_class(var10000, var10001);
         }

         id_class(id_class[34]);
         switch (var4) {
            case 1:
               id_class(id_class[35]);

               for (int var9 = var1; var9 + 8 <= var1 + var5; var9 += 8) {
                  var10000 = id_class[36];
                  var10001 = new Object[1];
                  var10001[id_throws[67]] = rrzH_2.id_catch(var0, var9);
                  id_class(var10000, var10001);
               }

               id_class(id_class[37]);
               break;
            case 10:
               id_class(id_class[38]);
               if (rrzH_2.id_while(var0, var1 + 4) != 1 || rrzH_2.id_while(var0, var1 + 6) != 24) {
                  id_class(id_class[39]);
               }

               var10000 = id_class[40];
               var10001 = new Object[1];
               var10001[id_throws[73]] = rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 8));
               id_class(var10000, var10001);
               var10000 = id_class[41];
               var10001 = new Object[1];
               var10001[id_throws[75]] = rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 16));
               id_class(var10000, var10001);
               var10000 = id_class[42];
               var10001 = new Object[1];
               var10001[id_throws[77]] = rrQO.id_protected(rrzH_2.id_catch(var0, var1 + 24));
               id_class(var10000, var10001);
               break;
            case 21589:
               var10000 = id_class[43];
               var10001 = new Object[1];
               var10001[id_throws[79]] = var0[var1];
               id_class(var10000, var10001);

               for (int var8 = var1 + 1; var8 + 4 <= var1 + var5; var8 += 4) {
                  var10000 = id_class[44];
                  var10001 = new Object[1];
                  var10001[id_throws[82]] = rrQO.id_throws(rrzH_2.id_try(var0, var8));
                  id_class(var10000, var10001);
               }
               break;
            default:
               var10000 = id_class[45];
               var10001 = new Object[2];
               var10001[id_throws[83]] = var4;
               var10001[1] = var5;
               id_class(var10000, var10001);
         }

         var1 += var5;
      }
   }

   private static void id_class(byte[] var0) {
      id_class(id_class[0]);
      id_class(id_class[1]);
      String var10000 = id_class[2];
      Object[] var10001 = new Object[1];
      var10001[id_throws[3]] = rrzH_2.id_catch(var0);
      id_class(var10000, var10001);
      if (rrzH_2.id_catch(var0) != (Long)rrzH_2.id_class[10]) {
         id_class(id_class[3]);
      } else {
         var10000 = id_class[4];
         var10001 = new Object[3];
         var10001[id_throws[5]] = rrzH_2.id_case(var0);
         var10001[1] = rrzH_2.id_case(var0) / 10;
         var10001[2] = rrzH_2.id_case(var0) % 10;
         id_class(var10000, var10001);
         var10000 = id_class[5];
         var10001 = new Object[1];
         var10001[id_throws[8]] = rrzH_2.id_byte(var0);
         id_class(var10000, var10001);
         var10000 = id_class[6];
         var10001 = new Object[1];
         var10001[id_throws[10]] = rrzH_2.id_final(var0);
         id_class(var10000, var10001);
         var10000 = id_class[7];
         var10001 = new Object[2];
         var10001[id_throws[11]] = rrzH_2.id_return(var0);
         var10001[1] = rrQO.id_break(rrzH_2.id_return(var0));
         id_class(var10000, var10001);
         var10000 = id_class[8];
         var10001 = new Object[1];
         var10001[id_throws[14]] = rrzH_2.id_else(var0);
         id_class(var10000, var10001);
         var10000 = id_class[9];
         var10001 = new Object[1];
         var10001[id_throws[16]] = rrzH_2.id_protected(var0);
         id_class(var10000, var10001);
         var10000 = id_class[10];
         var10001 = new Object[1];
         var10001[id_throws[18]] = rrzH_2.id_new(var0);
         id_class(var10000, var10001);
         var10000 = id_class[11];
         var10001 = new Object[2];
         var10001[id_throws[19]] = rrzH_2.id_extends(var0);
         var10001[1] = new String(var0, 30, rrzH_2.id_extends(var0));
         id_class(var10000, var10001);
         var10000 = id_class[12];
         var10001 = new Object[1];
         var10001[id_throws[22]] = rrzH_2.id_volatile(var0);
         id_class(var10000, var10001);
         if (rrzH_2.id_volatile(var0) != 0) {
            id_class(var0, 30 + rrzH_2.id_extends(var0), rrzH_2.id_volatile(var0));
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -61, 79, 114, -61, -4, 10, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new boolean[]{
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true
      };
   }

   private static void id_break(byte[] var0, int var1) {
      id_class(id_class[13]);
      String var10000 = id_class[14];
      Object[] var10001 = new Object[1];
      var10001[id_throws[25]] = rrzH_2.id_goto(var0, var1);
      id_class(var10000, var10001);
      if (rrzH_2.id_goto(var0, var1) != (Long)rrzH_2.id_class[12]) {
         id_class(id_class[15]);
      } else {
         var10000 = id_class[16];
         var10001 = new Object[4];
         var10001[id_throws[27]] = rrzH_2.id_throws(var0, var1);
         var10001[1] = rrzH_2.id_throws(var0, var1) >> 8;
         var10001[2] = (rrzH_2.id_throws(var0, var1) & 0xFF) / 10;
         var10001[3] = (rrzH_2.id_throws(var0, var1) & 0xFF) % 10;
         id_class(var10000, var10001);
         var10000 = id_class[17];
         var10001 = new Object[3];
         var10001[id_throws[29]] = rrzH_2.id_interface(var0, var1);
         var10001[1] = rrzH_2.id_interface(var0, var1) / 10;
         var10001[2] = rrzH_2.id_interface(var0, var1) % 10;
         id_class(var10000, var10001);
         var10000 = id_class[18];
         var10001 = new Object[1];
         var10001[id_throws[32]] = rrzH_2.id_else(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[19];
         var10001 = new Object[1];
         var10001[id_throws[34]] = rrzH_2.id_synchronized(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[20];
         var10001 = new Object[2];
         var10001[id_throws[35]] = rrzH_2.id_volatile(var0, var1);
         var10001[1] = rrQO.id_break(rrzH_2.id_volatile(var0, var1));
         id_class(var10000, var10001);
         var10000 = id_class[21];
         var10001 = new Object[1];
         var10001[id_throws[38]] = rrzH_2.id_protected(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[22];
         var10001 = new Object[1];
         var10001[id_throws[40]] = rrzH_2.id_finally(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[23];
         var10001 = new Object[1];
         var10001[id_throws[42]] = rrzH_2.id_int(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[24];
         var10001 = new Object[2];
         var10001[id_throws[43]] = rrzH_2.id_super(var0, var1);
         var10001[1] = new String(var0, var1 + 46, rrzH_2.id_super(var0, var1));
         id_class(var10000, var10001);
         var10000 = id_class[25];
         var10001 = new Object[1];
         var10001[id_throws[46]] = rrzH_2.id_instanceof(var0, var1);
         id_class(var10000, var10001);
         if (rrzH_2.id_instanceof(var0, var1) != 0) {
            id_class(var0, var1 + 46 + rrzH_2.id_super(var0, var1), rrzH_2.id_instanceof(var0, var1));
         }

         var10000 = id_class[26];
         var10001 = new Object[1];
         var10001[id_throws[48]] = rrzH_2.id_implements(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[27];
         var10001 = new Object[1];
         var10001[id_throws[50]] = rrzH_2.id_extends(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[28];
         var10001 = new Object[1];
         var10001[id_throws[52]] = rrzH_2.id_continue(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[29];
         var10001 = new Object[1];
         var10001[id_throws[54]] = rrzH_2.id_public(var0, var1);
         id_class(var10000, var10001);
         var10000 = id_class[30];
         var10001 = new Object[1];
         var10001[id_throws[56]] = rrzH_2.id_throw(var0, var1);
         id_class(var10000, var10001);
      }
   }

   private static void id_throws() {
      id_break = new byte[]{3, 10, 2, 10, 2, 2, 30, 30, 4, 8, 2, 10, 3, 10, 3, 10, 2, 10, 2, 2, 46, 46, 46, 4, 2, 4, 4, 2, 2, 8, 4, 6, 24, 8, 16, 24, 4, 2};
   }

   private static void id_protected() {
      id_protected = new long[]{4294967295L, 4294967295L, 4294967295L};
   }
}
