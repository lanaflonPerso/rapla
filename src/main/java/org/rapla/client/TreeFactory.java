package org.rapla.client;

import jsinterop.annotations.JsType;
import org.rapla.entities.Category;
import org.rapla.entities.Named;
import org.rapla.entities.domain.Allocatable;
import org.rapla.entities.dynamictype.ClassificationFilter;
import org.rapla.facade.Conflict;
import org.rapla.framework.RaplaException;

import java.util.Collection;
import java.util.function.Predicate;

@JsType
public interface TreeFactory {

	AllocatableNodes createAllocatableModel(ClassificationFilter[] filter) throws RaplaException;

	RaplaTreeNode createClassifiableModel(Allocatable[] classifiables, boolean useCategorizations);

	RaplaTreeNode createConflictModel(Collection<Conflict> conflicts ) throws RaplaException;

    RaplaTreeNode newNamedNode(Named element);

	RaplaTreeNode newStringNode(String s);

	RaplaTreeNode newRootNode();

	RaplaTreeNode createModel(Category rootCategory,  Predicate<Category> pattern);

	@JsType
	class AllocatableNodes
	{
		public final RaplaTreeNode allocatableNode;
		public final boolean filtered;

		public AllocatableNodes(RaplaTreeNode allocatableNode, boolean filtered)
		{
			this.allocatableNode = allocatableNode;
			this.filtered = filtered;
		}

		public RaplaTreeNode getAllocatableNode()
		{
			return allocatableNode;
		}

		public boolean isFiltered()
		{
			return filtered;
		}
	}

}