package celestial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkG {
   public static Pattern id_class = Pattern.compile("[\\w\\s(,=)]*uniform\\s+\\w+\\s+(\\w+).*");
   public static Pattern id_break = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
   public static Pattern id_byte = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern id_protected = Pattern.compile("\\s*const\\s+ivec3\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern id_throws = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern id_case = Pattern.compile("\\s*const\\s+vec2\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern id_catch = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern id_private = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
   public static Pattern id_implements = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*([\\w.,]+)\\s*(\\*/.*|\\s*)");
   public static Pattern id_finally = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
   public static Pattern id_extends = Pattern.compile("\\s*layout\\s*\\((.*)\\)\\s*(\\w+).*");
   public static Pattern id_native = Pattern.compile("[0-9N]+");
   public static Pattern id_volatile = Pattern.compile("[0-9N,]+");

   public static int id_byte(String var0) {
      byte var1 = -1;
      switch (var0.hashCode()) {
         case -1560188349:
            if (var0.equals("shadowcolor")) {
               var1 = 0;
            }
         default:
            switch (var1) {
               case 0:
                  return 0;
               default:
                  return id_class(var0, "shadowcolor", 0, 1);
            }
      }
   }

   public static rrdg_1 id_class(String var0) {
      Matcher var1 = id_class.matcher(var0);
      if (var1.matches()) {
         return new rrdg_1(rrdR.UNIFORM, var1.group(1), "", var0);
      } else {
         Matcher var2 = id_break.matcher(var0);
         if (var2.matches()) {
            return new rrdg_1(rrdR.ATTRIBUTE, var2.group(1), "", var0);
         } else {
            Matcher var3 = id_byte.matcher(var0);
            if (var3.matches()) {
               return new rrdg_1(rrdR.CONST_INT, var3.group(1), var3.group(2), var0);
            } else {
               Matcher var4 = id_protected.matcher(var0);
               if (var4.matches()) {
                  return new rrdg_1(rrdR.CONST_IVEC3, var4.group(1), var4.group(2), var0);
               } else {
                  Matcher var5 = id_throws.matcher(var0);
                  if (var5.matches()) {
                     return new rrdg_1(rrdR.CONST_FLOAT, var5.group(1), var5.group(2), var0);
                  } else {
                     Matcher var6 = id_case.matcher(var0);
                     if (var6.matches()) {
                        return new rrdg_1(rrdR.CONST_VEC2, var6.group(1), var6.group(2), var0);
                     } else {
                        Matcher var7 = id_catch.matcher(var0);
                        if (var7.matches()) {
                           return new rrdg_1(rrdR.CONST_VEC4, var7.group(1), var7.group(2), var0);
                        } else {
                           Matcher var8 = id_private.matcher(var0);
                           if (var8.matches()) {
                              return new rrdg_1(rrdR.CONST_BOOL, var8.group(1), var8.group(2), var0);
                           } else {
                              Matcher var9 = id_implements.matcher(var0);
                              if (var9.matches()) {
                                 return new rrdg_1(rrdR.PROPERTY, var9.group(2), var9.group(3), var0);
                              } else {
                                 Matcher var10 = id_finally.matcher(var0);
                                 if (var10.matches()) {
                                    return new rrdg_1(rrdR.EXTENSION, var10.group(1), var10.group(2), var0);
                                 } else {
                                    Matcher var11 = id_extends.matcher(var0);
                                    return var11.matches() ? new rrdg_1(rrdR.LAYOUT, var11.group(2), var11.group(1), var0) : null;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static int id_class(String var0, String var1, int var2, int var3) {
      if (!var0.startsWith(var1)) {
         return -1;
      } else {
         String var4 = var0.substring(var1.length());
         int var5 = rrbb_3.id_class(var4, -1);
         return var5 >= var2 && var5 <= var3 ? var5 : -1;
      }
   }

   public static int id_break(String var0) {
      switch (var0) {
         case "shadow":
            return 0;
         case "watershadow":
            return 1;
         default:
            return id_class(var0, "shadowtex", 0, 1);
      }
   }

   public static int id_throws(String var0) {
      return id_class(var0, "depthtex", 0, 2);
   }

   public static rja_3 id_finally(String var0) {
      int var1 = 1;
      int var2 = 1;
      int var3 = 1;
      String[] var4 = rrbb_3.id_class(var0, ",");

      for (int var5 = 0; var5 < var4.length; var5++) {
         String var6 = var4[var5];
         String[] var7 = rrbb_3.id_class(var6, "=");
         if (var7.length == 2) {
            String var8 = var7[0].trim();
            String var9 = var7[1].trim();
            int var10 = rrbb_3.id_class(var9, -1);
            if (var10 < 1) {
               return null;
            }

            if (var8.equals("local_size_x")) {
               var1 = var10;
            }

            if (var8.equals("local_size_y")) {
               var2 = var10;
            }

            if (var8.equals("local_size_z")) {
               var3 = var10;
            }
         }
      }

      return var1 == 1 && var2 == 1 && var3 == 1 ? null : new rja_3(var1, var2, var3);
   }

   public static int id_catch(String var0) {
      return id_class(var0, "colorimg", 0, 15);
   }

   public static int id_case(String var0) {
      int var1 = id_class(var0, "gaux", 1, 4);
      return var1 > 0 ? var1 + 3 : id_class(var0, "colortex", 0, 15);
   }

   public static String[] id_implements(String var0) {
      if (!id_volatile.matcher(var0).matches()) {
         return null;
      } else {
         var0 = var0.trim();
         return rrbb_3.id_class(var0, ",");
      }
   }

   public static int id_protected(String var0) {
      return id_class(var0, "shadowcolorimg", 0, 1);
   }

   public static String[] id_private(String var0) {
      if (!id_native.matcher(var0).matches()) {
         return null;
      } else {
         var0 = var0.trim();
         String[] var1 = new String[var0.length()];

         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] = String.valueOf(var0.charAt(var2));
         }

         return var1;
      }
   }
}
