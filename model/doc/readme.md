
```drawio-resource
../bootstrap.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of **Bootstrap 5.3 as a presentation profile** over the [UI model](https://ui.models.nasdanika.org/): contextual colors, sizes, breakpoints, color modes, the twelve-column grid, and the component set - cards, modals, navbars, alerts, badges, accordions, spinners, progress bars, toasts.

The division of labor is deliberate.
The UI model says *what is on the screen, what it is bound to, and what it is for* - layout, data and event bindings, documentation, provenance - and says nothing about appearance.
This model says *how it looks in Bootstrap terms* and re-says nothing about structure: [`Card`](references/eClassifiers/Card/index.html) is a UI `Container`, [`Button`](references/eClassifiers/Button/index.html) is a UI `Button` with a color and an outline flag, [`Switch`](references/eClassifiers/Switch/index.html) is a UI `Checkbox` rendered as a form-switch.
Swap the profile and the same logical screen renders somewhere else; the bindings, the documentation, and the governance record do not move.

Because it sits on the UI floor, it inherits the whole tower beneath: [threat](https://threat.models.nasdanika.org/), [architecture](https://architecture.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [decision binding](https://binding.decision.models.nasdanika.org/), [decision analysis](https://analysis.decision.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), [nxcore](https://nxcore.models.nasdanika.org/).
A card is documented, owned, staged, workable, governed, and threat-modelable without this model defining a single feature for any of it.
See [Nasdanika Models](https://nasdanika.com/models.html) for the full picture.

## The thesis

Bootstrap already is a design system - and almost nobody uses it as shipped.

What organizations actually run is *Bootstrap minus something plus something*: a subset of the contextual colors with local meanings ("`DANGER` only for destructive actions, never for validation errors"), a house rule about which breakpoints matter, a decision that modals are centered and scrollable by default, a ban on light badges on white surfaces, a theme that redefined `PRIMARY`.
That layer - the part that is genuinely yours - lives in a wiki page, a starter template that drifted, and the reviewer who remembers.

None of it is expressible in CSS, and none of it survives being written in prose.
`class="btn btn-primary btn-lg"` is a string: a typo is silent, a deprecated variant is invisible, and "which screens still use the old accent color" is a grep across repositories that only finds the spellings you thought of.
Typed enums, containment, and a documented metamodel turn that string into structure - and structure is queryable, validatable, diffable, and generatable.

## Competitive landscape

**Bootstrap itself, and its documentation.** Excellent reference material, and the definition of the vocabulary this model types.
What it cannot be is *your* documentation: it describes every option, including the ones you have banned, and knows nothing about your theme, your deprecations, or your accessibility floor.
Every organization ends up maintaining a shadow copy of it, by hand, in a wiki.

**Framework wrappers: React-Bootstrap, ng-bootstrap, BootstrapVue, Blazor Bootstrap, Thymeleaf and JSP tag libraries.** These do type the vocabulary - as component props, in one language, for one runtime, checked at compile time and forgotten afterwards.
They are rendering targets for this model rather than rivals.
What they do not provide is a representation of a screen that outlives the framework choice, or any answer to "which of our 400 screens use a dismissible alert".

**Visual builders: Bootstrap Studio, Pinegrow, Webflow, and the Bootstrap template marketplaces.** Fast for producing a page, and genuinely good at exploration.
The output is markup: once exported, the builder is no longer the source of truth, house rules cannot be expressed at all, and the generated class soup is exactly the untyped string this model exists to replace.

**Design tools and Bootstrap UI kits for Figma.** Give designers the look.
They stop at the picture, and the picture is the part Bootstrap already settled - the components are shipped, approved, and themed.
Re-drawing them at full fidelity produces a comp of something that already exists, while the layout, the responsive behavior per breakpoint, and the local rules stay outside the file.

**Design tokens: Style Dictionary, the W3C design tokens format, Bootstrap's own CSS custom properties.** The right idea one floor down.
Tokens are *values* - a color, a radius, a spacing step - with no notion of a component, a containment structure, a breakpoint span, or a lifecycle stage.
They answer "what is our brand blue"; they cannot answer "may a badge be light, and who approved that".

**Storybook and component catalogs.** Documents components well, as code, per framework, per repository.
It shows a component in its states; it does not model the estate that uses them, so deprecating a variant remains an announcement rather than an impact query.

**Agent-generated markup.** Language models emit Bootstrap fluently - it is one of the best-represented vocabularies in their training data - which turns "which classes may be emitted" from a style question into a policy question.
A typed catalog is the answer that can be checked before rendering, alongside the [A2UI model](https://a2ui.models.nasdanika.org/) on the protocol side.

**The actual competitor**, as everywhere else in the tower: a page of copied Bootstrap docs with local annotations, a starter template that no longer matches production, and a design review that catches what the reviewer happens to remember.

## What a typed model adds

**The vocabulary becomes enumerated, not spelled.** [`Color`](references/eClassifiers/Color/index.html), [`Size`](references/eClassifiers/Size/index.html), [`Breakpoint`](references/eClassifiers/Breakpoint/index.html), [`ColorMode`](references/eClassifiers/ColorMode/index.html), [`Placement`](references/eClassifiers/Placement/index.html), and [`SpinnerKind`](references/eClassifiers/SpinnerKind/index.html) are enums.
Completion in the editor, validation on load, refactoring across a federation, and "every use of `WARNING` in the estate" as a query rather than a regular expression.

**Theming is a mixin, not a copy-paste.** [`Themed`](references/eClassifiers/Themed/index.html) carries `background`, `textColor`, `border`, a local `colorMode` (Bootstrap 5.3 `data-bs-theme`, so dark mode is data and can be scoped to a subtree), and an optional [`Tooltip`](references/eClassifiers/Tooltip/index.html).
It is mixed into pages, cards, alerts, modals, and navbars alongside their UI supertypes - one definition, consistent semantics, no per-component drift.

**Responsive intent is structure.** [`Column`](references/eClassifiers/Column/index.html) contains [`Span`](references/eClassifiers/Span/index.html)s - a breakpoint and a width of 1..12, with 0 meaning auto.
"Which columns go full width below `MD`" and "where do we still assume `XS`" become queries over a model instead of a reading of class attributes.

**House rules become governance, with evidence.** Every element is `Governed` from the tower below: a rule such as "dismissible alerts require a documented recovery path" or "[`Progress`](references/eClassifiers/Progress/index.html) must carry an accessible label" is a `Control` with applications and evidence, an exception is a `Waiver` with an owner and an expiry, and a violation is a `Finding` that traces to the [`Work`](https://work.models.nasdanika.org/references/eClassifiers/Work/index.html) that closes it.
The guideline stops being a sentence somebody has to remember.

**Variants have a lifecycle and an owner.** `Staged` and `Undergoer` mean a component variant moves from proposed to approved to deprecated with dates, and carries the roles that authored, own, and approved it. Retiring the striped animated progress bar is an impact query, not an email.

**Bootstrap's own version story is modeled.** The 5.3 color-mode addition, the 3-to-4-to-5 class renames, the utilities that came and went: a migration becomes a model transformation with a diff, and "are we still on the old spelling anywhere" has an answer.

**Escape hatches stay honest.** The UI base gives every element `attributes`, `styleClasses`, and an inline `style`.
Utility classes this model does not type are still expressible - and, because they live in a different feature from the typed ones, the untyped residue is itself measurable: how much of the estate has fallen back to raw strings, and where.

**The metamodel stays micro.** New component kinds arrive through the UI model's [`Custom`](https://ui.models.nasdanika.org/references/eClassifiers/Custom/index.html) element and the [capability](https://docs.nasdanika.org/core/capability/index.html) framework - registered, not released.
This model types the Bootstrap components worth typing and declines to chase the whole utility surface.

## Applications

### Teaching Bootstrap

The metamodel is a concept map with the concepts already separated: vocabulary ([`Color`](references/eClassifiers/Color/index.html), [`Size`](references/eClassifiers/Size/index.html), [`Breakpoint`](references/eClassifiers/Breakpoint/index.html), [`ColorMode`](references/eClassifiers/ColorMode/index.html)), the grid ([`Row`](references/eClassifiers/Row/index.html), [`Column`](references/eClassifiers/Column/index.html), [`Span`](references/eClassifiers/Span/index.html)), and the components.
A learner sees that `Card`, `Modal`, and `Alert` are all containers differing in chrome, that `Switch` is a checkbox in different clothes, and that contextual color is one idea applied uniformly - relationships the documentation states in prose and the class attribute hides entirely.

Because documentation is a feature of every model element, the generated site *is* the course: this diagram, a page per classifier, the concept explained next to the Bootstrap reference it corresponds to, and each example shown as model, generated markup, and rendered result side by side.
Exercises are models - "build a responsive three-card row that stacks below `MD`" - and grading is validation.
The same posture the tower takes to onboarding elsewhere: teach the vocabulary an organization actually uses, from the artifact it actually runs.

### Documentation and organizational guidelines

The originating case for most adopters.
Generate the internal Bootstrap handbook from a model of your subset rather than maintaining a copy of the upstream docs:

* **Your palette, with meanings.** Which [`Color`](references/eClassifiers/Color/index.html)s are in use, what each one means locally, and which are forbidden - documented on the model element, not in a paragraph beside it.
* **Your defaults.** Modal sizing and centering, [`Navbar`](references/eClassifiers/Navbar/index.html) `expand` breakpoint, spinner kinds, [`Toast`](references/eClassifiers/Toast/index.html) `delay` and `autohide` - captured as documented prototypes teams start from.
* **Your constraints as controls.** Accessibility floors, contrast rules for [`Badge`](references/eClassifiers/Badge/index.html) and [`Alert`](references/eClassifiers/Alert/index.html) combinations, limits on [`Accordion`](references/eClassifiers/Accordion/index.html) nesting - governance controls with evidence and named owners.
* **Your deprecations.** Stage badges on the page, dated, with the successor named and the open work linked.
* **Your ownership.** Role assignments from the [role](https://role.models.nasdanika.org/) model, so every page says who to ask.

Publication is federated: each team publishes a model as a Maven artifact, the organization's handbook is the union, and a guideline change propagates as a dependency bump rather than a wiki edit nobody sees.

### Code generation

A [`Page`](references/eClassifiers/Page/index.html) generates an HTML page with Bootstrap 5.3 assets, a color mode, and the component tree beneath it - the near-term path via the [html](https://github.com/Nasdanika/html) and [html-app](https://github.com/Nasdanika-Models/html-app) stacks, with behavior supplied by a binding provider such as the [Alpine.js model](https://alpinejs.models.nasdanika.org/).
Beyond plain markup, the same model generates:

* **Framework components** - React-Bootstrap, ng-bootstrap, Blazor, Thymeleaf templates - because the profile is neutral about which library emits the classes.
* **Starter templates and scaffolds** regenerated from the guidelines instead of copied from a repository that has since drifted.
* **Catalog and example sites** - a Storybook-shaped artifact produced from the model, so the documentation and the code cannot disagree.
* **Migrations** - a Bootstrap 4 model transformed to 5.3, or a re-theme applied estate-wide as a model change with a reviewable diff.

New targets plug in through the capability framework rather than through a fork.

### Beyond the three

* **Validating agent-generated UI.** The catalog states which components and variants may be emitted; the model states whether what was emitted is structurally valid and rule-conformant - checked before it reaches a browser.
* **Modernization.** Legacy pages parsed into a model, presentation recovered as typed structure, then regenerated onto current Bootstrap - the posture taken elsewhere with [Visio](https://github.com/Nasdanika-Models/visio) and [PowerPoint](https://github.com/Nasdanika-Models/power-point).
* **Recorded decisions.** Bootstrap versus another framework, CDN versus bundled assets, which color-mode strategy - captured in the [decision analysis](https://analysis.decision.models.nasdanika.org/) and [decision binding](https://binding.decision.models.nasdanika.org/) models as variation points bound to alternatives, so the rationale outlives the people who made it.
* **Interface threat modeling.** Forms and file inputs inside a [`Modal`](references/eClassifiers/Modal/index.html), a federated [`Card`](references/eClassifiers/Card/index.html) included from another team, a CDN asset reference - entry points and supply-chain edges enumerable through the [threat](https://threat.models.nasdanika.org/) model rather than imagined.

## Model overview

| Area | Types |
|------|-------|
| Vocabulary | [Color](references/eClassifiers/Color/index.html), [Size](references/eClassifiers/Size/index.html), [Breakpoint](references/eClassifiers/Breakpoint/index.html), [ColorMode](references/eClassifiers/ColorMode/index.html) (5.3 `data-bs-theme`), [Placement](references/eClassifiers/Placement/index.html), [SpinnerKind](references/eClassifiers/SpinnerKind/index.html) |
| Theming | [Themed](references/eClassifiers/Themed/index.html) (`background`, `textColor`, `border`, `colorMode`, `tooltip`), [Tooltip](references/eClassifiers/Tooltip/index.html) |
| Page and grid | [Page](references/eClassifiers/Page/index.html), [Row](references/eClassifiers/Row/index.html), [Column](references/eClassifiers/Column/index.html), [Span](references/eClassifiers/Span/index.html) (per-breakpoint width, 0 meaning auto) |
| Components | [Button](references/eClassifiers/Button/index.html), [Alert](references/eClassifiers/Alert/index.html), [Badge](references/eClassifiers/Badge/index.html), [Card](references/eClassifiers/Card/index.html), [Modal](references/eClassifiers/Modal/index.html), [Accordion](references/eClassifiers/Accordion/index.html), [AccordionItem](references/eClassifiers/AccordionItem/index.html), [Navbar](references/eClassifiers/Navbar/index.html), [Spinner](references/eClassifiers/Spinner/index.html), [Progress](references/eClassifiers/Progress/index.html), [Toast](references/eClassifiers/Toast/index.html), [Switch](references/eClassifiers/Switch/index.html) |
| Reused, not redefined | UI `Element` / `Container` / `Layout` / `Text` / `Checkbox` / `Button` and all bindings; governance `Governed`, work `Workable`, lifecycle `Staged`, role `Undergoer`, nxcore `ModelElement` / `Documented` / `Marked` |

## Authoring and tooling

Models are authored in the [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON, or diagrammed with the [Drawio model](https://drawio.models.nasdanika.org/) with fine-grained details in external files.
The package loads through the [capability](https://docs.nasdanika.org/core/capability/index.html) framework - `BootstrapEPackageResourceSetCapabilityFactory` registers the EPackage and points at this documentation - so a resource set resolves `https://bootstrap.models.nasdanika.org` with the model jar on the classpath and nothing else to configure.
This site is generated from the same model with the [Nasdanika CLI](https://docs.nasdanika.org/core/cli/index.html).
