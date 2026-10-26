package celestial;

public interface rjN_2 {
   rjN_2 id_class = (var0, var1) -> false;
   rjN_2 id_break = (var0, var1) -> !var0 && !var1;
   rjN_2 id_byte = (var0, var1) -> var1 && !var0;
   rjN_2 id_protected = (var0, var1) -> !var0;
   rjN_2 id_throws = (var0, var1) -> var0 && !var1;
   rjN_2 id_case = (var0, var1) -> !var1;
   rjN_2 id_catch = (var0, var1) -> var0 != var1;
   rjN_2 id_private = (var0, var1) -> !var0 || !var1;
   rjN_2 id_implements = (var0, var1) -> var0 && var1;
   rjN_2 id_finally = (var0, var1) -> var0 == var1;
   rjN_2 id_extends = (var0, var1) -> var1;
   rjN_2 id_native = (var0, var1) -> !var0 || var1;
   rjN_2 id_volatile = (var0, var1) -> var0;
   rjN_2 id_final = (var0, var1) -> var0 || !var1;
   rjN_2 id_package = (var0, var1) -> var0 || var1;
   rjN_2 id_int = (var0, var1) -> true;

   boolean apply(boolean var1, boolean var2);
}
