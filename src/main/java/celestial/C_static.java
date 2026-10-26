/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_double;
import celestial.C_import;
import celestial.C_switch;
import celestial.C_transient;
import celestial.Q;
import celestial.W;
import celestial.c_1;
import celestial.x_1;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public interface C_static {
    public LinkedList<C_import> id_byte();

    public <T> T id_byte(C_double<T> var1);

    public <E extends Enum<?>> E id_byte(Class<E> var1) throws W, Q;

    public <T> T id_byte(Class<T> var1, T var2) throws Q;

    public C_import id_byte(int var1) throws Q;

    public <E extends Enum<?>> E id_byte(Class<E> var1, int var2) throws Q;

    public <T, O, D extends C_switch<T, O>> T id_byte(D var1, O var2);

    public <T, O> T id_class(C_switch<T, O> var1);

    public <T> T id_class(Class<T> var1, int var2) throws Q, W;

    public String id_class(String var1, int var2) throws Q;

    public String id_class();

    public String[] id_class(String var1) throws Q;

    public <T> T id_class(Class<T> var1, T var2) throws Q;

    public <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2, T var3);

    public <E extends Enum<?>> E id_class(Class<E> var1, E var2) throws Q;

    public <T, D extends C_double<T>> T id_class(D var1, T var2);

    public void id_class(int var1) throws c_1;

    public <T extends C_transient> Stream<String> id_class(T var1);

    public <T> T id_class(C_double<T> var1) throws Q, W;

    public <T> T id_class(Class<T> var1, T var2, int var3) throws Q;

    public <T, D extends C_double<T>> T id_class(Class<D> var1);

    public <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2) throws Q, W;

    public String id_break(String var1) throws Q;

    public <T, D extends C_double<T>> T id_break(Class<D> var1, T var2);

    public <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2, T var3);

    public <T, O> T id_break(C_switch<T, O> var1) throws W, Q;

    public String id_break();

    public <T, D extends C_double<T>> T id_break(D var1) throws Q, W;

    public <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2) throws W, Q;

    public <T> T id_break(Class<T> var1) throws Q;

    public <T> T id_break(Class<T> var1, int var2) throws Q;

    public boolean id_break(int var1);

    public <T, O, D extends C_switch<T, O>> T id_throws(D var1, O var2);

    public boolean id_throws(Class<?> var1, int var2) throws Q;

    public C_import id_throws() throws Q;

    public <T> T id_throws(Class<T> var1) throws Q;

    public String id_throws(int var1) throws Q;

    public C_static id_finally();

    public <E extends Enum<?>> E id_finally(Class<E> var1) throws Q;

    public boolean id_catch(int var1);

    public C_import id_catch() throws Q;

    public <T> T id_catch(Class<T> var1) throws W, Q;

    public String id_extends() throws Q;

    public boolean id_extends(Class<?> var1) throws Q;

    public <T, D extends C_double<T>> T id_case(Class<D> var1);

    public boolean id_case();

    public boolean id_case(int var1);

    public String id_implements() throws Q;

    public <E extends Enum<?>> E id_implements(Class<E> var1) throws W, Q;

    public <T, O> T id_protected(C_switch<T, O> var1, O var2) throws Q, W;

    public <T> T id_protected(Class<T> var1) throws Q, W;

    public void id_protected(int var1) throws x_1;

    public <T, D extends C_double<T>> T id_protected(D var1);

    public Deque<C_import> id_protected();

    public <E extends Enum<?>> E id_protected(Class<E> var1, int var2) throws W, Q;

    public void id_private(int var1) throws Q;

    public C_import id_private();

    public <E extends Enum<?>> E id_private(Class<E> var1) throws Q;

    public boolean id_final();

    public boolean id_volatile();

    public boolean id_native();
}

